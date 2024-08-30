package com.e_sun_interview.vote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMSController {
    @RequestMapping("/cms")
    // 這個地方需要顯示後台資料
    public String hello() {
        return "Hello World!";
    }
}
