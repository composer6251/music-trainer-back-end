package com.musictrainer.background.musictrainer.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/****this class talks with front end and directs request accordingly*****/

@RestController
@CrossOrigin(origins = "http://localhost:4500")
public class TestDBService {

        @Autowired
        private TestDBController testDBController;

        @GetMapping("/users/{username}/userinfo")
        public List<TestDBData> getUserInfo(@PathVariable String username){
                System.out.println("getUserInfo: " + testDBController.getTestDBData());
            return testDBController.getTestDBData();
        }
}
