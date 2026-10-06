package com.example.springcloud.consumer.openfeign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 使用 @FeignClient 注解需要指明服务的名称
@FeignClient(name = "nacos-provider-9001")
public interface TestProviderService {

    @GetMapping("/provider/get_port")
    String getServerPort();

}
