package com.kong.services.a.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-b")
public interface ServiceB {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(String name);
}
