package com.lushwe.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2019-06-24 15:05
 * @since 1.0
 */
@EnableAutoConfiguration
public class DubboProviderDemo {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderDemo.class,args);
    }
}
