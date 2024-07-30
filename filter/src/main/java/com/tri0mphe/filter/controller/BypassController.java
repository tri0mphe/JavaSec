package com.tri0mphe.filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class BypassController {


    @RequestMapping(value = "/getToken", method = RequestMethod.GET)
    public String hello() {
        return "token is Tri0mphe";
    }
}
