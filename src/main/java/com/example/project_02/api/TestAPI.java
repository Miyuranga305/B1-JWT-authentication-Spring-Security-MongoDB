package com.example.project_02.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
public class TestAPI {

    @GetMapping
    public String get(){
        return "OK bro you are [USER,ADMIN,MANAGER]";
    }

}
