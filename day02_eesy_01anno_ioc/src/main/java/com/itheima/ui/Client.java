package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:06
 * 模拟一个表现出用于调用业务层
 **/
public class Client {
    /**
     * 获取spring的IOC核心容器并根据id获取对象
     * ApplicationContext三个常用实现类：
     *      ClassPathXmlApplicationContext ：它可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了
     *      FileSystemXmlApplicationContext ：它可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *      AnnotationConfigApplicationContext ： 它是用于读取注解创建容器的
     * 核心容器的两个接口引发出的问题：
     *      ApplicationContext：    单例对象适用    实际开发更多采用此接口
     *          它在构建核心容器时，创建对象采取的策略时采用立即加载的方式，也就是说，只要一读取完
     *          配置文件马上就创建配置文件中的配置对象
     *      BeanFactory:            多例对象适用
     *          它在构建核心容器时，创建对象采用延迟加载的方式。也就是说，什么时候根据id获取对象了
     *          什么时候才真正的创建对象
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountServiceImpl");
        IAccountDao adao = (IAccountDao) ac.getBean("accountDaoImpl");
        System.out.println(adao);
        System.out.println(as);

        as.saveAccount();
    }
}
