package com.itheima.service;

import com.itheima.domain.Account;

/**
 * @program: day04_eesy_04tx
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 20:22
 **/
public interface IAccountService {

    Account findAccountById(Integer id);

    void transfer(String sourceName, String targetName, Float money);
}
