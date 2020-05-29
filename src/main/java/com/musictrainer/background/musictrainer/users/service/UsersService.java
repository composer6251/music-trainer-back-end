package com.musictrainer.background.musictrainer.users.service;

import org.graalvm.compiler.lir.LIRInstruction;

import java.util.List;

public class UsersService {

    private List<UsersData> users;

    public void addUser(String email, String password){

        users.add(email);

        ///return user;
    }
}
