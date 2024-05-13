package com.tutomato.disasteralert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/test")
    public String testPage(){
        return "content/index";
    }
}
