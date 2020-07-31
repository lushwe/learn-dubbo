package com.lushwe.dubbo.spi.service.impl;

import com.lushwe.dubbo.spi.service.AdaptiveExt;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2020-04-29 10:40
 * @since 0.1
 */
//@Adaptive
public class DubboAdaptiveExtImpl implements AdaptiveExt {

//    public DubboAdaptiveExtImpl() {
//
//    }

//    public DubboAdaptiveExtImpl(String name) {
//        System.out.println(name);
//    }

    @Override
    public String echo(String msg, URL url) {

        return "dubbo: msg=" + msg + ", url=" + url;
    }
}
