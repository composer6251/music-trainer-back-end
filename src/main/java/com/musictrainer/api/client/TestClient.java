package com.musictrainer.api.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "feignclienttest")
public interface TestClient {


}
