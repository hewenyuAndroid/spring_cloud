package com.example.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/get_port")
    public String getDiscovery() {
        System.out.println("serverURL:" + serverURL);
        // url: 表示被调用的目标rest接口位置
        // url的第一部分是在 `nacos` 中注册的服务提供者名称，如果多个服务提供注册名称相同名称，Ribbon 会自动寻找其中一个服务提供者，并调用接口方法。这个就是负载均衡功能。
        // url后半部分就是控制器的请求路径
        // 第二个参数是返回值类型
        // 第三个参数是可变参数，是传递给url的动态参数
        return restTemplate.getForObject(serverURL + "/provider/get_port", String.class);
    }

}
