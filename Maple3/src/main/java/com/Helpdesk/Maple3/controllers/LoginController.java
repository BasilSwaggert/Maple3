package com.Helpdesk.Maple3.controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "", "login"})
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        String password = "123";
        String hash = new BCryptPasswordEncoder().encode(password);
        System.out.println(hash);
        return "login/index";
    }
}
