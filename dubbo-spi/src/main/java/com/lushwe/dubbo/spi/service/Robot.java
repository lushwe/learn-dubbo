package com.lushwe.dubbo.spi.service;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2019-08-07 16:50
 * @since 0.1
 */
@SPI("bumblebee")
//@SPI("optimusPrime")
public interface Robot {

    void sayHello();

}
