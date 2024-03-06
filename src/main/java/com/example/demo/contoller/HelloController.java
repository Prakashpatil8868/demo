package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say/{MyName}/{MyCity}")
    public String sayHello(@PathVariable("MyName") String name,@PathVariable("MyCity") String city){
        return "Hey"+name+ ", how are you"+city;
    }
    @GetMapping("/add")
    public String addNumbers(){
        return String.valueOf(2+3);
    }
}
