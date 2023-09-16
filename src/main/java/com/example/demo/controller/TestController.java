package com.example.demo.controller;

import com.example.demo.model.TestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public TestModel test(){
        TestModel testModel = new TestModel();
        testModel.setTest("test");
        System.out.println("test out");
        return testModel;
    }
}
