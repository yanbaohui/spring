package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:01
 * 业务层实现类
 *
 * 曾经xml的配置：
 * <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 *              scope="" init-method="" destroy-method="" >
 *              <property name="" value="" | ref =""></property>
 *
 * </bean>
 *
 *  用于创建对象的
 *          他们的作用就和在xml配置文件中编写一个<bean>标签实现的功能一样的
 *           @Component：
 *              作用：用于把当前类对象存入spring容器中
 *              属性：value 用于指定bean的id。当我们不写时，它的默认值时当前类名且首字母改小写
 *           @Controller : 一般用于表现层
 *           @Service： 一般用于业务层
 *           @Repository：一般用于持久层
 *           以上三个注解它们的作用和属性与Component是一模一样的。它们三个是spring框架为我们提供明确的
 *           三层使用的注解，使我们的三层对象更加清晰
 *  用于注入数据的
 *          他们的作用就在xml配置文件中bean标签中写一个property标签作用是一样的
 *          @Autowired:
 *              作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配。就可以注入成功
 *                      如果ioc容器中没有任何bean的类型和要注入的变量类型匹配就会报错
 *                      如果ioc容器中有多个类型匹配时：先根据类型查找。然后根据变量名在查找
 *              出现位置：可以是变量上，也可以是方法上
 *          细节：
 *              使用注解注入时，set方法就不是必须的了
 *
 *          @Qualifier：在按照类型中注入的基础之上再按照名称注入，它在给类成员注入时不能单独使用，但是在给方法参数注入
 *          时可以
 *              属性：value 用于指定注入bean的id
 *
 *          @Resource：
 *               作用：直接按照bean的id注入。它可以单独使用
 *               属性：name：用于指定bean的id
 *
 *           以上三个注解都只能注入其他类型的数据，而基本类型和string类型无法使用上述注解实现
 *           另外，集合类型的注入只能通过xml来实现。
 *
 *
 *           @Value：
 *                作用：用于注入基本类型和string类型的数据
 *                属性：value：用于指定数据的值，它可以使用spring中的SpEL（也就是spring中的EL表达式）
 *                      SpEL的写法：${表达式}
 *  用于改变作用范围的
 *          跟bean标签中使用scope属性实现的功能一样的
 *          @Scope:
 *                 作用：用于指定bean的作用范围
 *                 属性：
 *                      value：指定范文的取值。常用取值：singleton和 prototype （默认单列）
 *  和生命周期相关  了解
 *          @preDestroy：
 *                  作用：用于指定销毁方法
 *          @PostConstruct
 *                  作用：用于指定初始化方法
 *          他们的作用跟在bean标签使用init-method="" destroy-method=""一样的
 **/

@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IAccountDao accountDao;



    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
