package com.musictrainer.api.users.service;


import com.musictrainer.api.users.data.TestEntity;
import com.musictrainer.api.users.data.UserEntity;
import com.musictrainer.api.users.domain.TestDTO;
import com.musictrainer.api.users.repo.TestJpaRepository;
import com.musictrainer.api.users.repo.UsersJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UsersService {
//
//    private static List<UserEntity> users = new ArrayList<>();
//    private static int idCounter = 0;

    @Autowired
    private UsersJpaRepository repository;

    @Autowired
    private TestJpaRepository testJpaRepository;

//    static {
//        users.add(new UserEntity(++idCounter, "David", "dfennell31@gmail.com", 7, "test"));
//        users.add(new UserEntity(++idCounter, "Missy", "udontno32@aol.com", 8, "test"));
//
//    }

    public Optional<TestEntity> testFetchFromDB(){
        //return repository.getAllUsers();
        Optional<TestEntity> testEntity = testJpaRepository.findById(1);
        return testEntity;
    }

//    public UserEntity findUserById(int id){
//
//        UserEntity userToReturn;
//        //loop through users to see if user with id exists
//        for (UserEntity user:users) {
//            if(user.getId() == id){
//                userToReturn = user;
//                return userToReturn;
//            }
//        }
//        return null;
//    }

//    //Return all users
//    public List<UserEntity> getAllUsers(){
//
//        return users;
//    }

//    public UserEntity saveUser(UserEntity user){
//        System.out.println("userId of new User: " + user.getId());
//        if(user.getId() == -1 || user.getId() == 0){
//            user.setId(++idCounter);
//            user.setCurrentLevel(1);
//            users.add(user);
//        }
//        System.out.println("User to add: " + user);
//        return user;
//    }

//    public UserEntity deleteUser(int id){
//        UserEntity userToDelete = findUserById(id);
//
//        users.remove(userToDelete);
//
//        return userToDelete;
//    }
}
