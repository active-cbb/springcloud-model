package com.abin.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CXB
 * @version 1.0.0
 * @ClassName ProviderController.java
 * @Description TODO
 * @createTime 2022年02月28日 19:12:00
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    Integer port;

    @GetMapping("/abin")
    public String hello(){
        return "hello abin";
    }

}
