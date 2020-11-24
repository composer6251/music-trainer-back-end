//package com.musictrainer.api.users.controller;
//
//import com.musictrainer.api.users.data.UserEntity;
//import com.musictrainer.api.users.repo.UsersJpaRepository;
//import com.musictrainer.api.users.service.UsersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//
///*******
// * this class routes user related http requests coming from front end
// */
//
//@RestController
//@CrossOrigin(origins = "http://localhost:4500", allowCredentials = "true", allowedHeaders = "*")
//public class UsersJpaController {
//
//    @Autowired
//    private UsersService usersService;
//
//    @Autowired
//    private UsersJpaRepository usersJpaRepository;
//
////    @PostMapping("jpa/users/addUser")
////    public ResponseEntity<Void> addUserToDb(@RequestBody UserEntity user){
////
////        UserEntity userToSave = usersService.saveUser(user);
////
////        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{user}").buildAndExpand(userToSave.getId()).toUri();
////
////        return ResponseEntity.created(uri).build();
////    }
////
////    @GetMapping("jpa/users")
////    public List<UserEntity> getAllUsers(){
////
////        return usersService.getAllUsers();
////    }
//
////    @GetMapping("jpa/users/{username}")
////    public List<UserEntity> getAllUserData(@PathVariable String name){
////
////        return usersJpaRepository.findByName(name);
////        //return usersService.getAllUsers();
////    }
//
//    @GetMapping("jpa/users/{id}")
//    public UserEntity getUser(@PathVariable int id){
//
//        return usersJpaRepository.findById(id).orElse(null);
//        //return usersService.findUserById(id);
//    }
//
//    //Delete user
////    @DeleteMapping("jpa/users/{id}")
////    public ResponseEntity<Void> deleteUser(@PathVariable int id){
////
////        UserEntity userToDelete = usersService.deleteUser(id);
////
////        if(userToDelete == null){
////            return ResponseEntity.noContent().build();
////        }
////
////        return ResponseEntity.notFound().build();
////    }
//
//}
