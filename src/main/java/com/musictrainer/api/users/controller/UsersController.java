package com.musictrainer.api.users.controller;

import com.musictrainer.api.client.TestClient;
import com.musictrainer.api.users.data.UsersData;
import com.musictrainer.api.users.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

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

    @PostMapping("/users/addUser")
    public ResponseEntity<Void> addUserToDb(@RequestBody UsersData user){

        UsersData userToSave = usersService.saveUser(user);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{user}").buildAndExpand(userToSave.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @GetMapping("/users")
    public List<UsersData> getAllUsers(){

        return usersService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UsersData getUser(@PathVariable int id){

        return usersService.findUserById(id);
    }

    //Delete user
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){

        UsersData userToDelete = usersService.deleteUser(id);

        if(userToDelete == null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }

    //Test FeignClient
    @GetMapping("/test-feign-client")
    public String testFeignClient(){
        log.info("/test-feign");
        return client.feignTest();
    }

    @GetMapping("/test")
    public String test(){
        return "reached";
    }

}
