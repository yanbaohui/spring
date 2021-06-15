package com.itheima.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @program: day04_eesy_01jdbctemplate
 * @description
 * @author: yanbaohui
 * @create: 2021-04-26 16:52
 * JdbcTemplate最基本用法
 **/
public class JdbcTemplateDemo2 {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        jt.execute("insert into account(name,money)values ('eee',1000)");


//        //准备数据源:spring的内置数据源
////        DriverManagerDataSource ds = new DriverManagerDataSource();
////        ds.setDriverClassName("com.mysql.jdbc.Driver");
////        ds.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=UTF-8");
////        ds.setUsername("root");
////        ds.setPassword("sr198064");
////
////        //1.创建JdbcTemplate对象
////        JdbcTemplate jt = new JdbcTemplate();
////        jt.setDataSource(ds);
////        jt.execute("insert into account(name,money)values ('ccc',1000)");
    }


}
