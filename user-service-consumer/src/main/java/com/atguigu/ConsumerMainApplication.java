package com.atguigu;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerMainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);

        orderService.initOrder("1");

        System.out.println("调用结束------------");
        System.in.read();  // 按任意键退出
    }
}
