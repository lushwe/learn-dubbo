package com.lushwe.dubbo.spi.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2020-04-29 10:39
 * @since 0.1
 */
@SPI
public interface AdaptiveExt {

    @Adaptive({"adaptive.echo"})
    String echo(String msg, URL url);
}
