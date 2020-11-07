package com.musictrainer.api.testing.service;

//This class receives the request from TestDBService and calls DB for data and returns it to TestDBService

import com.musictrainer.api.testing.entity.TestDBData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDBService {

    //Incrementer for id
    private static long idCounter = 0;
    //List to hold TestDBData
    private static List<TestDBData> testDBData = new ArrayList<>();


    static{
        testDBData.add(new TestDBData(++idCounter, "David","Password", 7));
        testDBData.add(new TestDBData(++idCounter, "Mac","Password", 6));
        testDBData.add(new TestDBData(++idCounter,"Missy","Password", 6));

    }

    public TestDBData findUserTestDBData(long id){

        for(TestDBData currentUser : testDBData)
            if(currentUser.getId() == id){
                return currentUser;
            }
        return null;
    }

    public List<TestDBData> getAllTestDBData(){
        return testDBData;
    }
    public TestDBData deleteUserTestDBData(long id){
        System.out.println("id: " + id);
        TestDBData userToDelete = findUserTestDBData(id);

        if(userToDelete == null){
            return null;
        }
        else{
            System.out.println("In Else");
            testDBData.remove(userToDelete);
            return userToDelete;
        }

    }

}