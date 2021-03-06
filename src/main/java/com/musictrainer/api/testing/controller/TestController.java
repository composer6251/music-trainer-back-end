package com.musictrainer.api.testing.controller;

import com.musictrainer.api.testing.service.TestDBService;
import com.musictrainer.api.testing.entity.TestDBData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****this class is initially for testing connection with dummy DB. talks with front end and directs request accordingly*****/

@RestController
@CrossOrigin(origins = "http://localhost:4500")
public class TestController {

        @Autowired
        private TestDBService testDBController;

        @GetMapping("/users/{username}/userinfo")
        public List<TestDBData> getUserInfo(@PathVariable String username){

                return testDBController.getAllTestDBData();
        }

        @DeleteMapping("/users/{username}/userinfo/{id}")
        public ResponseEntity<Void> deleteUserInfo(@PathVariable String username, @PathVariable long id){

                TestDBData testDBData = testDBController.deleteUserTestDBData(id);
                if(testDBData != null){
                        return  ResponseEntity.noContent().build();
                }
                return ResponseEntity.notFound().build();
        }
//        @DeleteMapping("/users/{username}/userinfo/{id}")
//        public TestDBData deleteUserInfo(@PathVariable String username, @PathVariable long id){
//                System.out.println("getUserInfo: " + testDBController.getAllTestDBData());
//                return testDBController.deleteUserTestDBData(id);
//        }
}
