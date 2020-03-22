package com.example.demoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
class UserController {

    @GetMapping("{name}")
    public String helloUser(@PathVariable String name) {
        return "Hello " + name;
    }

}