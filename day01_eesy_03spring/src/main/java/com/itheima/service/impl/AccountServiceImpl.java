package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:01
 * 业务层实现类
 **/
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();



    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
