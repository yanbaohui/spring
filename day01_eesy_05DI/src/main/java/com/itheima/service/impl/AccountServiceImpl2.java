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
public class AccountServiceImpl2 implements IAccountService {
    //经常变动的数据并不适用于注入的方式
    private  String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount执行了。。"+name+","+age+","+birthday);
    }
}
