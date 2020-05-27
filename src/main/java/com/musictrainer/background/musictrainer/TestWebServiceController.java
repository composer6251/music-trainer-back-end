package com.musictrainer.background.musictrainer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4500")
public class TestWebServiceController {

    @GetMapping("/messagingservice")
    public String testMessage(){

        return "Test Message from Java Back End";
    }

    @GetMapping("/messagingservicebean")
    public TestWebServiceBean testWebServiceBean(){
       // System.out.println("In TestWebServiceBean. new Bean: " + new TestWebServiceBean("Test message from Java Back End Bean"));
        return new TestWebServiceBean("Test message from Java Back End Bean");
    }

    @GetMapping("/messagingServiceBean/path-variable/{name}")
    public TestWebServiceBean testWebServiceBean(@PathVariable String name){
        return new TestWebServiceBean(String.format("Test message from Java Back End %s", name));
    }
}
