package com.example.springcloud.nacosconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigCenterApplication.class, args);
    }

}
