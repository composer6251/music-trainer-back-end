package com.musictrainer.background.musictrainer.testdb;

//This class receives the request from TestDBService and calls DB for data and returns it to TestDBService

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDBController{

    //List to hold TestDBData
    private static List<TestDBData> testDBData = new ArrayList<>();

    static{
        testDBData.add(new TestDBData("David","Password", 7));
    }

    public List<TestDBData> getTestDBData(){

        return testDBData;
    }
}