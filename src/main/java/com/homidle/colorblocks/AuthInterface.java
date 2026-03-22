package com.homidle.colorblocks;

public interface AuthInterface {
    public String login(String username, String password);
    public int move(String color, int score);
}
