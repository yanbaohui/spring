package com.itheima.test;


import com.itheima.config.SpringConfiguration;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: day03_eesy_03springAOP
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 20:00
 **/

public class AOPTest {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();
    }
}
