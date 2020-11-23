package com.musictrainer.api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "feignclienttest", url = "localhost:8085")
public interface TestClient {

    @GetMapping(path = "/feignclienttest")
    String feignTest();
}
