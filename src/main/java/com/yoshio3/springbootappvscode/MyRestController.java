package com.yoshio3.springbootappvscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World from GitHub";
    }
}
