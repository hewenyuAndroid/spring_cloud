package com.example.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/provider/get_port")
    public String getServerPort() {
        return "Hello Nacos Discovery, server port: " + port;
    }

}
