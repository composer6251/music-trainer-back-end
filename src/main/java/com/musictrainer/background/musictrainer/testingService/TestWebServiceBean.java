package com.musictrainer.background.musictrainer.testingService;

public class TestWebServiceBean {
    private String message;

    public TestWebServiceBean (String message){
        System.out.println("message in bean Constructor: " + message);
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
//        return "TestWebServiceBean{" +
//                "message='" + message + '\'' +
//                '}';
        return String.format("HellowWorldBean [message=%s]", message);
    }
    public String getMessage() {
        return message;
    }



}
