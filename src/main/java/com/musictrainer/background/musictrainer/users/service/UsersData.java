package com.musictrainer.background.musictrainer.users.service;

import lombok.Data;

@Data
public class UsersData {

    private int id;
    private int currentLevel;
    private String email;
    private String password;

    public UsersData(int id, int currentLevel, String email, String password) {
        this.id = id;
        this.currentLevel = currentLevel;
        this.email = email;
        this.password = password;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getCurrentLevel() {
//        return currentLevel;
//    }
//
//    public void setCurrentLevel(int currentLevel) {
//        this.currentLevel = currentLevel;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
