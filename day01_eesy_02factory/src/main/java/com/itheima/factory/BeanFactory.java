package com.itheima.factory;


import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @program: day01_eesy_02factory
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-20 09:09
 * 创建Bean对象的工厂
 * Bean，在计算机英语中，有可重用组件的意思
 * JavaBean:用java语言编写的可重用组件
 *          JavaBean > 实体类
 *
 *     它就是创建我们的service和dao对象
 *
 *     第一个：需要一个配置文件来配置我们的service和dao
 *              配置内容：唯一标识=全限定类名 （key=value）
 *     第二个：通过读取配置文件中配置的内容反射创建对象
 *
 *
 *     配置文件 可以时xml也可以是properties
 **/
public class BeanFactory {
    private static Properties props;

    //定义一个map用于存放创建的对象，称之为容器
    private static Map<String,Object> beans;

    //使用静态代码块为Properties对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();
            //获取properties流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            beans = new HashMap<>();
            //取出配置文件中所有的key
            Enumeration keys = props.keys();
            while (keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPath).getDeclaredConstructor().newInstance();
                //把key和value存入容器
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败!");
        }
    }

    /**
     * 根据bean的名称获取bean对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);


//        Object bean = null;
//        String beanPath = props.getProperty(beanName);
//        try {
//            bean = Class.forName(beanPath).getDeclaredConstructor().newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return bean;
    }
}
