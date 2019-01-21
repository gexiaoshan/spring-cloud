package com.example.eurekadiscovery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gexiaoshan on 2019/1/15.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String getTest(HttpServletRequest request)
    {
        System.out.println("test>>>>>>");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }

        return  "eureka-discovery：" + request.getServerPort();
    }

    @RequestMapping("/test2")
    public String getTes2t(HttpServletRequest request)
    {
        System.out.println("test2>>>>>>");
        try{
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }

        return  "eureka-discovery：" + request.getServerPort();
    }

    @RequestMapping("/test3")
    public String getTes3t(HttpServletRequest request)
    {
        System.out.println("test3>>>>>>");
        try{
            Thread.sleep(4100);
        } catch (Exception e){
            e.printStackTrace();
        }

        return  "eureka-discovery：" + request.getServerPort();
    }
}
