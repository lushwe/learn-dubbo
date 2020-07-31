package com.lushwe.dubbo.spi.service.impl;

import com.lushwe.dubbo.spi.service.Robot;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2019-08-07 16:50
 * @since 0.1
 */
@Adaptive
public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {

        System.out.println("Hello, I am Optimus Prime.");
    }
}
