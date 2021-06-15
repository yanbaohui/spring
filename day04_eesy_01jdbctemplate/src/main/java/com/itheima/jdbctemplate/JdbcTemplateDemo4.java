package com.itheima.jdbctemplate;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program: day04_eesy_01jdbctemplate
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 16:52
 * JdbcTemplate最基本用法
 **/
public class JdbcTemplateDemo4 {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao = (IAccountDao) ac.getBean("accountDao");
        System.out.println(accountDao.findAccountById(1));
        System.out.println(accountDao.findAccountByName("ccc"));
        Account account = new Account();
        account.setName("fw");
        account.setMoney(123456f);
        account.setId(1);
        accountDao.updateAccount(account);



    }
}
