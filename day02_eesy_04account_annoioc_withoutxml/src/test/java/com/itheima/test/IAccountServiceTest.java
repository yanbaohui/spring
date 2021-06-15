package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: day02_eesy_02account_xmlioc
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-21 22:08
 * spring整合junit的配置
 *      1.导入spring整合junit的jar
 *      2.使用junit提供的一个注解把原有的main方法替换，替换成spring提供的
 *              @Runwith
 *      3.告知spring的运行器，spring和ioc的创建是基于xml还是注解
 *              @ContextConfiguration:
 *                  locations,指定xml文件的位置，加上classpath关键字，表示在类路径下
 *                  classes：指定注解类所在的位置
 *
 *      当我们使用spring 5.x版本的时候，要求junit的jar包必须是4.1.2以上
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class  IAccountServiceTest {

    @Autowired
    private IAccountService as;



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