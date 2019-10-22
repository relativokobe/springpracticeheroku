package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @CrossOrigin
    @GetMapping("/helloworld")
    public List<User> getUsers() {
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        return sampleService.getUsers();
    }

}
