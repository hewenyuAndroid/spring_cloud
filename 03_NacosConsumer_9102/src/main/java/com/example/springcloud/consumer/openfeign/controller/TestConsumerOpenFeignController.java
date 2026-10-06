package com.example.springcloud.consumer.openfeign.controller;

import com.example.springcloud.consumer.openfeign.rpc.TestProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumerOpenFeignController {

    @Autowired
    private TestProviderService testProviderService;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("/consumer_open_feign/get_port")
    public String getServerPort(){
        System.out.println("使用open feign访问provider, serverURL: " + serverURL);
        return testProviderService.getServerPort();
    }

}
