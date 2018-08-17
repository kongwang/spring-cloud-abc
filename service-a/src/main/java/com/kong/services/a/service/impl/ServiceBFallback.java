package com.kong.services.a.service.impl;

import com.kong.services.a.service.ServiceB;
import org.springframework.stereotype.Component;

/**
 * @author:wang.jiang
 * @date:2018/8/17 9:33
 */
@Component
public class ServiceBFallback implements ServiceB {
    @Override
    public String sayHello(String name) {
        return "sry,服務B不可用";
    }
}
