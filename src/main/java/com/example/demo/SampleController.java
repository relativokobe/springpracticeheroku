package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    
    @CrossOrigin
    @GetMapping("/helloworld")
    public String qrCodeSample2() {
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        System.out.println("================ this is a sample log");
        return "Jetty lablab";
    }

}
