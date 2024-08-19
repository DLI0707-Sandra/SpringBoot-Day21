package com.example.springBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingContoller
{
    @GetMapping
    public String greet() {
        return "Hello, welcome to the website!";
    }
}
