package com.atguigu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMainApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("provider.xml").start();

        System.in.read();//按任意键盘退出
    }
}
