package com.bridglebabz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringController {

    @RequestMapping(value = ("/hello"), method = RequestMethod.GET)
    public String hello() {

        return "Hello Everyone from Bridgelabz";
    }

    @GetMapping("/world")
    public String world() {

        return "hello world";
    }

    @PostMapping("/send/{name}")
    public String post(@PathVariable String name) {
        return "hello" + " " + name + " " + "..!";
    }

    @PostMapping("/query")
    public String share(@RequestParam String name) {
        return "hello" + " " + name + " " + "..!";
    }

}





