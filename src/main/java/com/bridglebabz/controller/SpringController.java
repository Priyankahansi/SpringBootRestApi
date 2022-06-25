package com.bridglebabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping(value = ("/hello"),method = RequestMethod.GET)
    public String hello()
    {
        return "Hello Everyone from Bridgelabz";
    }
    @GetMapping("/world")
    public String world(){

        return "hello world";
    }
}
