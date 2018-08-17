package com.kong.services.b.service.impl;

import com.kong.services.b.service.ServiceA;
import org.springframework.stereotype.Component;

/**
 * @author:wang.jiang
 * @date:2018/8/17 9:32
 */
@Component
public class ServiceAFallback implements ServiceA {
    @Override
    public String sayHello(String name) {
        return "sry,服務A不可用";
    }
}
