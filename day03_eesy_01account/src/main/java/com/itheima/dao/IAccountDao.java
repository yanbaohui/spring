package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @program: day02_eesy_02account_xmlioc
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-21 21:34
 * 账户的持久层接口
 **/
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 查询一个
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     * @param id
     */
    void deleteAccount(Integer id);

    /**
     * 根据名称查询账户，
     * @param accountName
     * @return 如果有唯一的结果就返回，否则返回null
     *         如果结果集超过一个就抛异常
     */
    Account findAccountByName(String accountName);
}
