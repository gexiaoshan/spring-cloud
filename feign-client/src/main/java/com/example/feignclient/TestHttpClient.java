package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gexiaoshan on 2019/1/17.
 * Feign的客户端接口定义
 */
@FeignClient("eureka-discovery")
public interface TestHttpClient {

    @GetMapping("/test")
    String test();
}
