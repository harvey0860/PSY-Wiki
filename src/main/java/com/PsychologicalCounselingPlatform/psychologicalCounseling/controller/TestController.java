package com.PsychologicalCounselingPlatform.psychologicalCounseling.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller return a page
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
