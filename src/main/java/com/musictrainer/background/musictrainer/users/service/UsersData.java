package com.musictrainer.background.musictrainer.users.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UsersData {

    private int id;
    private String name;
    private String email;
    private int currentLevel;
    private String password;

    public UsersData(int id, String name, String email, int currentLevel, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.currentLevel = currentLevel;
        this.password = password;
    }
}
