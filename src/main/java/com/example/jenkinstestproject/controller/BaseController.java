package com.example.jenkinstestproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/health")
    public String healthCheck (){
        return "APIs are live!!!!";
    }
}
