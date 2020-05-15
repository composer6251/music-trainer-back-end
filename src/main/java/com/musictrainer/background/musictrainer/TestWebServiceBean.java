package com.musictrainer.background.musictrainer;

public class TestWebServiceBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "TestWebServiceBean{" +
                "message='" + message + '\'' +
                '}';
    }
    public String getMessage() {
        return message;
    }
    public TestWebServiceBean (String message){
        this.message = message;
    }

}
