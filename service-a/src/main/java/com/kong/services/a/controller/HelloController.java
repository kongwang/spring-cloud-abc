package com.kong.services.a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wang.jiang
 * @date:2018/8/16 14:27
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String sayHello(String name) {
        return String.format("i'm service a,hello %s", name);
    }
}
