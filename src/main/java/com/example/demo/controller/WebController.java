package com.example.demo.controller;

import com.example.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    CustomerRepository repository;

    @RequestMapping("/test")
    public String findAlltest(){
        String result = "";

        return repository.customMethod().toString();

    }
}
