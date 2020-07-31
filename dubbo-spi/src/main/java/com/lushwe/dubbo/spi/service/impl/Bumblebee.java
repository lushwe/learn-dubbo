package com.lushwe.dubbo.spi.service.impl;

import com.lushwe.dubbo.spi.UserService;
import com.lushwe.dubbo.spi.service.Robot;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.threadpool.ThreadPool;

/**
 * 说明：TODO 写点注释吧
 *
 * @author Jack Liu
 * @date 2019-08-07 16:51
 * @since 0.1
 */
//@Adaptive
public class Bumblebee implements Robot {

    private UserService userService;

    private ThreadPool threadPool;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setThreadPool(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    @Override
    public void sayHello() {

        System.out.println("Hello, I am Bumblebee.");
//        System.out.println("userService-->" + userService);
//        System.out.println("threadPool-->" + threadPool);
    }
}
