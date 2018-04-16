package com.tsy.eurekaclient.testribbon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class MyRibbon {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> params = new HashMap<>();
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8081/hello",String.class);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class);
        String body = responseEntity.getBody();
        System.out.println(body);
    }
}
