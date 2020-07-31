package com.lushwe.dubbo.demo.impl;

import com.lushwe.dubbo.demo.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2019-06-24 14:09
 * @since 1.0
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
