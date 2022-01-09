package com.yuan.controller;

import com.yuan.config.WXConfig;
import com.yuan.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/test")
@PropertySource({"classpath:pay.properties"})
public class TestController {

    @Value("${wxpay.appid}")
    private String wxPayAppId;

    @Value("${wxpay.security}")
    private String wxPaySecurity;

    @Autowired
    private WXConfig wxConfig;

    @GetMapping("list")
    public JsonData testExt() {
        int i = 1/0;

        return JsonData.buildSuccess("");
    }

    @GetMapping("config")
    public JsonData testConfig() {
        Map<String, String> map = new HashMap<>();

        map.put("appid", wxConfig.getPayAppId());
        map.put("security", wxConfig.getPaySecurity());

        return JsonData.buildSuccess(map);
    }

}
