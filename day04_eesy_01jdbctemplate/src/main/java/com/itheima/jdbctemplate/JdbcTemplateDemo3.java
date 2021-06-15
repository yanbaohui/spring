package com.itheima.jdbctemplate;

import com.itheima.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: day04_eesy_01jdbctemplate
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 16:52
 * JdbcTemplate的CRUD
 **/
public class JdbcTemplateDemo3 {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");

//        jt.update("insert into account(name,money)values (?,?)","fff",3333f);
//        jt.update("update account set name = ?, money = ? where id = ?","test",1234,8);
//        jt.update("delete from account where id = ?",8);

//        List<Account> accounts = jt.query("select * from account where money > ?", new AccountRowMapper(), 1000f);
//        List<Account> accounts = jt.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 1000f);
//        for (Account account : accounts) {
//            System.out.println(account);
//        }

//        List<Account> account = jt.query("select * from account where id = ?", new AccountRowMapper(), 1);
//        System.out.println(account.isEmpty()?"没有类容":account.get(0));

        Integer count = jt.queryForObject("select count(*) from account where money > ?", Integer.class, 1000f);
        System.out.println(count);


    }


}
/**
 * 定义Account的封装策略
 * @author yanbaohui
 * @date 2021/4/26 17:25
 * @return null
 */
class AccountRowMapper implements RowMapper<Account>{


    /**
     * 把结果集中的数据封装到Account中，然后由spring把每个Account加到集合中
     * @author yanbaohui
     * @date 2021/4/26 17:25
     * @param resultSet
     * @param i
     * @return com.itheima.domain.Account
     */
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getFloat("money"));
        return account;
    }
}
