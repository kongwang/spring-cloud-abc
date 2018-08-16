package com.kong.services.b.controller;

import com.kong.services.b.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wang.jiang
 * @date:2018/8/16 14:27
 */
@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Autowired
    ServiceA serviceA;

    @GetMapping("")
    public String sayHello(String name) {
        return String.format("i'm service b,hello %s", name);
    }

    @GetMapping("/toA")
    public String sayHelloToA(String name) {
        return serviceA.sayHello(name);
    }
}
