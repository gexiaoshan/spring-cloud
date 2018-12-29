package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gexiaoshan on 2018/12/28.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${test.test}")
    private String test;

    @RequestMapping("/test")
    public String getTest(){
        return test;
    }
}
