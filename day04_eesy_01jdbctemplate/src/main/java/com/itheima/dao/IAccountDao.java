package com.itheima.dao;

import com.itheima.domain.Account;

/**
 * @program: day04_eesy_01jdbctemplate
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 18:24
 **/
public interface IAccountDao {
    Account findAccountById(Integer id);
    Account findAccountByName(String name);
    void updateAccount(Account account);
}
