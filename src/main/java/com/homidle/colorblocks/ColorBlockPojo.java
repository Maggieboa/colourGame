package com.homidle.colorblocks;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.annotation.processing.Generated;

@Table(name = "color")
public class ColorBlockPojo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private int score;
    private String username;
    private String password;
    private String color;
    private String direction;

    //empty constructor
    public ColorBlockPojo() {
    }

    //constructor
    public ColorBlockPojo(long id, int score, String username, String password, String color, String direction) {
        this.id = id;
        this.score = score;
        this.username = username;
        this.password = password;
        this.color = color;
        this.direction = direction;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
