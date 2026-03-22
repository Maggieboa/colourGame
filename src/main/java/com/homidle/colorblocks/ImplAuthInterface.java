package com.homidle.colorblocks;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ImplAuthInterface implements AuthInterface{

    private ColorBlockInterface colorBlockInterface;
    private ColorJwtUtil colorJwtUtil;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public ImplAuthInterface(ColorBlockInterface colorBlockInterface, ColorJwtUtil colorJwtUtil, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.colorBlockInterface = colorBlockInterface;
        this.colorJwtUtil = colorJwtUtil;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public String login(String username, String password) {
        ColorBlockPojo colorBlockPojo = colorBlockInterface.findByUsername(username)
                .orElseThrow(()-> new RuntimeException("user not found"));
        if (bCryptPasswordEncoder.matches(password, colorBlockPojo.getPassword())){

            return colorJwtUtil.generateToken(username);
        }
        return "Incorrect user password";
    }

    @Override
    public int move(String color, int score) {
        score = 0;
        ColorBlockPojo colorBlockPojo = new ColorBlockPojo();
        colorBlockPojo.setColor(color);

        return score+1;
    }
}
