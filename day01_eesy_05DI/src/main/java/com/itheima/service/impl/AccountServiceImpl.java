package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.Date;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:01
 * 业务层实现类
 **/
public class AccountServiceImpl implements IAccountService {
    //经常变动的数据并不适用于注入的方式
    private  String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount执行了。。"+name+","+age+","+birthday);
    }
}
