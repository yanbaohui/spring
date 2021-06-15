package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:01
 * 业务层实现类
 **/
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("service中的saveAccount执行了");
    }
}
