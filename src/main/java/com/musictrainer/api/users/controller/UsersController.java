package com.musictrainer.api.users.controller;

import com.musictrainer.api.client.TestClient;
import com.musictrainer.api.users.data.UserEntity;
import com.musictrainer.api.users.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*******
 * this class routes user related http requests coming from front end
 */

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4500", allowCredentials = "true", allowedHeaders = "*")
public class UsersController {

    @Autowired
    private TestClient client;

    @Autowired
    private UsersService usersService;
//todo: change dev profile
//todo: change mySql creds in properties
    //todo: constants for base URL
    //todo: add basic auth/user validation
    //todo: existing user login
    //todo: change pathvariables to requestbodies
    //todo: add validator for requests
    @PostMapping("/users/registerNewUser/{email}/{password}/{username}")
    public Optional<UserEntity> registerNewUser(@PathVariable String email, @PathVariable String password, @PathVariable String username){

        Optional<UserEntity> userToSave = usersService.registerNewUser(email, password, username);

        return userToSave;
    }

    @GetMapping("/users/validate-user/{username}/{password}")
    public Optional<UserEntity> validateUserLogin(@PathVariable String username, @PathVariable String password){

        return usersService.findUserByUsername(username, password);
    }
    @GetMapping("/users/{id}")
    public Optional<UserEntity> getUser(@PathVariable int id){

        return usersService.findUserById(id);
    }

    @GetMapping("/users/authenticate/{id}")
    public Optional<UserEntity> authenticateUser(@PathVariable int id){

        Optional<UserEntity> authenticatedUser = usersService.findUserById(id);
        if(!authenticatedUser.isPresent()){
            return Optional.empty();
        }
        return authenticatedUser;
    }

    //Leaving in case another service needs to be set up as a client
//    @GetMapping("/test-feign-client")
//    public String testFeignClient(){
//        log.info("/test-feign");
//        return client.feignTest();
//    }
}
