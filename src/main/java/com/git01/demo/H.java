package com.git01.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H {
    @RequestMapping("info")
    public String info(){
        return "Hello Springboot info";

    }

}
