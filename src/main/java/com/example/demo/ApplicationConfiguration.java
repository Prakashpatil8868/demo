package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class ApplicationConfiguration {
    @Bean
    public RestTemplate createResttemplate(){
        return new RestTemplate().build();
    }
}
