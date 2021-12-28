package com.raptor.jvm.chapter1;


import java.net.URL;
import java.security.Provider;

/**
 * @author raptor
 * @description ClassLoaderTest1
 * @date 2021/12/28 10:29
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("*********启动类加载器************");
        // 获取BootstrapClassLoader 能够加载的API的路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        // 从上面路径中，随意选择一个类，来看看他的类加载器是什么：得到的是null，说明是  根加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);
    }
}
