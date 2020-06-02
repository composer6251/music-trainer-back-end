package com.musictrainer.background.musictrainer.users.service;



import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    private static List<UsersData> users = new ArrayList<>();
    private static int idCounter = 0;

    static {
        users.add(new UsersData(++idCounter, 7, "David Test Account", "dfennell31@gmail.com"));
    }

    public UsersData findUserById(int id){

        UsersData userToReturn;
        //loop through users to see if user with id exists
        for (UsersData user:users) {
            if(user.getId() == id){
                userToReturn = user;
                return userToReturn;
            }
        }
        return null;
    }

    //Return all users
    public List<UsersData> getAllUsers(){

        return users;
    }

    public UsersData saveUser(UsersData user){

        users.add(user);

        return user;
    }

    public UsersData deleteUser(int id){
        UsersData userToDelete = findUserById(id);

        users.remove(userToDelete);

        return userToDelete;
    }
}
