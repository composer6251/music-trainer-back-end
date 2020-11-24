package com.musictrainer.api.users.service;

import com.musictrainer.api.users.data.UserEntity;
import com.musictrainer.api.users.repo.TestJpaRepository;
import com.musictrainer.api.users.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    @Autowired
    private TestJpaRepository testJpaRepository;

    public Optional<UserEntity> findUserById(int id){
        Optional<UserEntity> userEntity = repository.findById(id);
        return userEntity;
    }

    public Optional<UserEntity> findUserByUsername(String username, String password){

        UserEntity userReturned = new UserEntity();
        userReturned = repository.findByUsername(username);

        // Valid Credentials
        if(nonNull(userReturned) && nonNull(userReturned.getPassword()) && userReturned.getPassword().equals(password)){
            return Optional.of(userReturned);
        }
        //todo: handle non existing user null pointer
        //non existing user
//        if(isNull(userReturned)) {
//            Optional<UserEntity> user = UserEntity.builder()
//                    .errorMessage("Invalid Username");
//        }

        //Invalid credentials
        userReturned.setErrorMessage("Invalid Username or Password");
        return Optional.of(userReturned);


    }

    public Optional<UserEntity> registerNewUser(String email, String password, String username){
        UserEntity newUser = new UserEntity();

        if(!isNull(repository.findByUsername(email.toUpperCase()))){
           newUser.setErrorMessage("User already exists");
           return Optional.of(newUser);
        }
        try{
            newUser.setCurrentLevel(1);
            newUser.setEmail(email);
            newUser.setUsername(email);
            newUser.setPassword(password);
            newUser.setName(username.toUpperCase());

            repository.save(newUser);
            return Optional.of(newUser);
        }
        catch(Exception e){
            newUser.setErrorMessage(e.getMessage());
        }
        return Optional.of(newUser);
    }
}
