package com.example.springcloud.nacosconfigcenter.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Data
@RefreshScope   // 配置 nacos 动态刷新功能
@Configuration
public class NacosConfig {

    @Value("${server.url}")
    private String url;

    @Value("${server.desc}")
    private String desc;

}
