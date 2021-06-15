package com.itheima.utils;

/**
 * @program: day03_eesy_03springAOP
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 19:35
 * 用于记录日志的工具类，它里面提供了公共的代码
 **/
public class Logger {

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是被增强的业务层方法）
     * @author yanbaohui
     * @date 2021/4/25 19:36
     */
    public void printLog(){
        System.out.println("Logger类中的printLog方法开始执行记录日志了");
    }
}
