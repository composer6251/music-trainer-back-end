package com.musictrainer.background.musictrainer.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****this class talks with front end and directs request accordingly*****/

@RestController
@CrossOrigin(origins = "http://localhost:4500")
public class TestDBService {

        @Autowired
        private TestDBController testDBController;

        @GetMapping("/users/{username}/userinfo")
        public List<TestDBData> getUserInfo(@PathVariable String username){
                System.out.println("getUserInfo: " + testDBController.getAllTestDBData());
                return testDBController.getAllTestDBData();
        }

        @DeleteMapping("/users/{username}/userinfo/{id}")
        public ResponseEntity<Void> deleteUserInfo(@PathVariable String username, @PathVariable long id){
                System.out.println("Delete mapping");

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
