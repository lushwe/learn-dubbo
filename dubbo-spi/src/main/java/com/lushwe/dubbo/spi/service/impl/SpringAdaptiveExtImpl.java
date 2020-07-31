package com.lushwe.dubbo.spi.service.impl;

import com.lushwe.dubbo.spi.service.AdaptiveExt;
import org.apache.dubbo.common.URL;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2020-04-29 10:40
 * @since 0.1
 */
public class SpringAdaptiveExtImpl implements AdaptiveExt {

    @Override
    public String echo(String msg, URL url) {

        return "spring: msg=" + msg + ", url=" + url;
    }
}
