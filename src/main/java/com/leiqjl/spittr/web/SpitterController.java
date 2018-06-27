package com.leiqjl.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spitter")
public class SpitterController {

    @GetMapping("register")
    public String showRegisterationForm() {
        return "registerForm";
    }
}
