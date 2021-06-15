package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: day02_eesy_02account_xmlioc
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-21 22:08
 **/
public class IAccountServiceTest {
    private IAccountService as;

    @Before
    public void init(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        as = (IAccountService) ac.getBean("accountService");
    }

    @Test
    public void findAll() {
        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void findAccountById() {
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("ddd");
        account.setMoney(1000f);
        as.saveAccount(account);
    }

    @Test
    public void updateAccount() {
        Account account = new Account();
        account.setId(4);
        account.setName("ddd");
        account.setMoney(100f);
        as.updateAccount(account);
    }

    @Test
    public void deleteAccount() {
        as.deleteAccount(4);
    }
}