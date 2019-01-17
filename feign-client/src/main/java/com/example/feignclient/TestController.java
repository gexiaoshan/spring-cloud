package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gexiaoshan on 2019/1/15.
 */
@RestController
public class TestController {

    @Autowired
    TestHttpClient testHttpClient;

    @RequestMapping("/test")
    public String getTest(){
        return testHttpClient.test();
    }
}
