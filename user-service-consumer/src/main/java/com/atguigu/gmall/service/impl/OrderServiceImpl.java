package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1 . 让服务提供者注册到注册中心
 *   （1） 导入dubbo的依赖
 * 2. 让服务消费者到注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        //1. 查询用户的收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);

        for (UserAddress userAddress : userAddressList) {
            System.out.println("地址： " + userAddress.getUserAddress());
        }

    }
}
