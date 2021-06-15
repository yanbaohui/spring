package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * @program: day03_eesy_03springAOP
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 19:34
 **/
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
