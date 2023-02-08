package com.vinutha.DockerTest.DockerTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String helloDocker(){
        return "Hello Docker user";
    }
}
