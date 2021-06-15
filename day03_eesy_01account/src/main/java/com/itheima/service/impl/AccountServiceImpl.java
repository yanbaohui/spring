package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.ConnectionUtils;
import com.itheima.utils.TransactionManager;

import java.util.List;

/**
 * @program: day02_eesy_02account_xmlioc
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-21 21:33
 * 事务控制都在业务层
 **/
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;


    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer....");

            //1.根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //3.转出账户减钱，转入账户加钱
            source.setMoney(source.getMoney()-money);
            target.setMoney(target.getMoney()+money);
            //4.更新转出账户
            accountDao.updateAccount(source);
//            int i = 1/0;
            //5.更新转入账户
            accountDao.updateAccount(target);
    }
}
