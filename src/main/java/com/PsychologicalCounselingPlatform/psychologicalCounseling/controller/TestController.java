package com.PsychologicalCounselingPlatform.psychologicalCounseling.controller;

import com.PsychologicalCounselingPlatform.psychologicalCounseling.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

// @Controller return a page
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "hello3";
    }
}
