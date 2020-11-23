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

    @Autowired
    private UsersJpaRepository repository;

    @Autowired
    private TestJpaRepository testJpaRepository;

    public Optional<TestEntity> testFetchFromDB(int id){
        //return repository.getAllUsers();
        Optional<TestEntity> testEntity = testJpaRepository.findById(id);
        return testEntity;
    }

    public Optional<UserEntity> findUserById(int id){
        //return repository.getAllUsers();
        Optional<UserEntity> userEntity = repository.findById(id);
        return userEntity;
    }
}
