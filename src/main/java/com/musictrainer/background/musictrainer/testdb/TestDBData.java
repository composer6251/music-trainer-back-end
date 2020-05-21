package com.musictrainer.background.musictrainer.testdb;

import lombok.Data;

/*
This class is a DB simulation until actual instance is stood up
 */
@Data
public class TestDBData {

    private String username;
    private String password;
    private int currentLevel;

    public TestDBData(String username, String password, int currentLevel) {
        this.username = username;
        this.password = password;
        this.currentLevel = currentLevel;
    }
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getCurrentLevel() {
//        return currentLevel;
//    }
//
//    public void setCurrentLevel(int currentLevel) {
//        this.currentLevel = currentLevel;
//    }



}
