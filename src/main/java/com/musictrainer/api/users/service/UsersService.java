package com.musictrainer.api.users.service;


import com.musictrainer.api.users.data.UsersData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class UsersService {

    private static List<UsersData> users = new ArrayList<>();
    private static int idCounter = 0;

    static {
        users.add(new UsersData(++idCounter, "David", "dfennell31@gmail.com", 7, "test"));
        users.add(new UsersData(++idCounter, "Missy", "udontno32@aol.com", 8, "test"));

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
        System.out.println("userId of new User: " + user.getId());
        if(user.getId() == -1 || user.getId() == 0){
            user.setId(++idCounter);
            user.setCurrentLevel(1);
            users.add(user);
        }
        System.out.println("User to add: " + user);
        return user;
    }

    public UsersData deleteUser(int id){
        UsersData userToDelete = findUserById(id);

        users.remove(userToDelete);

        return userToDelete;
    }
}
