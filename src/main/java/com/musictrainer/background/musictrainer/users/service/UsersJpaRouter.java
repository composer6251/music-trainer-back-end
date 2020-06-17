package com.musictrainer.background.musictrainer.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/*******
 * this class routes user related http requests coming from front end
 */

/****
 * Routing:
 *
 *
 *
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4500", allowCredentials = "true", allowedHeaders = "*")
public class UsersJpaRouter {

    @Autowired
    private UsersService usersService;

    @PostMapping("jpa/users/addUser")
    public ResponseEntity<Void> addUserToDb(@RequestBody UsersData user){

        UsersData userToSave = usersService.saveUser(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{user}").buildAndExpand(userToSave.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @GetMapping("jpa/users")
    public List<UsersData> getAllUsers(){

        return usersService.getAllUsers();
    }

    @GetMapping("jpa/users/{id}")
    public UsersData getUser(@PathVariable int id){

        return usersService.findUserById(id);
    }

    //Delete user
    @DeleteMapping("jpa/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){

        UsersData userToDelete = usersService.deleteUser(id);

        if(userToDelete == null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

}
