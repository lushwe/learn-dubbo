package com.lushwe.dubbo.spi;

import com.lushwe.dubbo.spi.service.AdaptiveExt;
import com.lushwe.dubbo.spi.service.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * 说明：Dubbo SPI 测试
 *
 * @author Jack Liu
 * @date 2019-08-07 16:56
 * @since 0.1
 */
public class DubboSpiTest {

    public static void main(String[] args) {

//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        runExt();
        runRobot();

    }

    public static void runExt() {

        ExtensionLoader<AdaptiveExt> extensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);

        AdaptiveExt adaptiveExt = extensionLoader.getAdaptiveExtension();

        URL url = URL.valueOf("test://localhost/test?adaptive.echo=spring");

        String echo = adaptiveExt.echo("1", url);

        System.out.println(echo);

    }

    public static void runRobot() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        System.out.println("getAdaptiveExtension");
        Robot robot = extensionLoader.getAdaptiveExtension();
        robot.sayHello();

        System.out.println("getDefaultExtension");
        robot = extensionLoader.getDefaultExtension();
        robot.sayHello();

//        System.out.println("getExtension(\"optimusPrime\")");
//        robot = extensionLoader.getExtension("optimusPrime");
//        robot.sayHello();

        System.out.println("getExtension(\"bumblebee\")");
        robot = extensionLoader.getExtension("bumblebee");
        robot.sayHello();
    }
}
