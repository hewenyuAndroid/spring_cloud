package com.example.springcloud.nacosconfigcenter.controller;

import com.example.springcloud.nacosconfigcenter.config.NacosConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigCenterController {

    @Autowired
    private NacosConfig nacosConfig;

    @GetMapping("/config_center/get_server_config")
    public String getServerConfig() {
        return "serverUrl: " + nacosConfig.getUrl() + "\ndesc: " + nacosConfig.getDesc();
    }

}
