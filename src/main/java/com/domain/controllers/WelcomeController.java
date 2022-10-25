package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome") // untuk menetapkan endpoint/url
public class WelcomeController {

    @GetMapping // supaya function tereksekusi ketika request datang dalam bentuk get
    public String greeting() {
        return "Welcome to SpringBoot Rest API";
    }

}
