package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @program: day01_eesy_04bean
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 19:48
 * 模拟一个工厂类，（该类可能存在与jar包中，我们无法通过修改源码的方式来提供默认构造函数)
 *
 **/
public class StaticFactory {

    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
