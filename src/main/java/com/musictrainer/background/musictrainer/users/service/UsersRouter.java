package com.musictrainer.background.musictrainer.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*******
 * this class routes user related http requests coming from front end
 */
@RestController
@CrossOrigin(origins = "http://localhost:4500")
public class UsersRouter {

    @Autowired
    private UsersService usersService;

    @PutMapping("http://localhost:8080/users/{email}/addUser/{password}")
    public List<UsersData> addUserToDb(@PathVariable String email, @PathVariable String password){

        return usersService.addUser(email, password);

    }


}
