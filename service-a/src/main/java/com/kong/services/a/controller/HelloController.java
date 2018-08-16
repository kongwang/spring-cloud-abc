package com.kong.services.a.controller;

import com.kong.services.a.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    private static final String KEY_A = "a";
    @Autowired
    ServiceB serviceB;
    @Value("${value.a}")
    private String valueA;

    @Value("${value.b}")
    private String valueB;

    @GetMapping("")
    public String sayHello(String name) {
        return String.format("i'm service a,hello %s", name);
    }

    @GetMapping("/value")
    public String getValue(String key) {
        if (key.equals(KEY_A)) {
            return valueA;
        }
        return valueB;
    }

    @GetMapping("/toB")
    public String sayHelloToB(String name) {
        return serviceB.sayHello(name);
    }
}
