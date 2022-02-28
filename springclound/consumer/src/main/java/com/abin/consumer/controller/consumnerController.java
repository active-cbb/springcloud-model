package com.abin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * @author CXB
 * @version 1.0.0
 * @ClassName consumnerController.java
 * @Description TODO
 * @createTime 2022年02月28日 19:21:00
 */
@RestController
public class consumnerController {

    @Resource
    DiscoveryClient discoveryClient;



//    @GetMapping("/abin1")
//    public String Hello() throws IOException {
//
//            List<ServiceInstance> provider = discoveryClient.getInstances("provider");
//            ServiceInstance instance = provider.get(0);
//            String host = instance.getHost();
//            int port = instance.getPort();
//            System.out.println(host+":"+port+"--------------------------");
//            StringBuffer stringBuffer = new StringBuffer();
//            stringBuffer.append("http://")
//                    .append(host)
//                    .append(":")
//                    .append(port)
//                    .append("/abin");
//            String forObject = restemplateone.getForObject(stringBuffer.toString(), String.class);
//            return  forObject;
//        }

        @Autowired

        RestTemplate restTemplate;

    @GetMapping("/abin1")
        public String  p(){
            return  restTemplate.getForObject("http://provider/abin",String.class);
        }



}
