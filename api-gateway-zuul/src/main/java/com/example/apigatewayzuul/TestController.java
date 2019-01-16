package com.example.apigatewayzuul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gexiaoshan on 2019/1/15.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String getTest(){
        return "api-gateway-zuul";
    }
}
