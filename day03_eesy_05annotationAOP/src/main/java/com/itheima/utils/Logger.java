package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: day03_eesy_03springAOP
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 19:35
 * 用于记录日志的工具类，它里面提供了公共的代码
 **/

@Component("logger")
@Aspect//表示当前类是一个切面
public class Logger {

    @Pointcut("execution(* com.itheima.service.impl.*.*(..))")
    private void pt1(){}

    /**
     * 前置通知
     * @author yanbaohui
     * @date 2021/4/25 19:36
     */
    //@Before("pt1()")
    public void beforePrintLog(){
        System.out.println("前置通知Logger类中的beforePrintLog方法开始执行记录日志了");
    }
    /**
     * 后置通知
     * @author yanbaohui
     * @date 2021/4/25 20:36
     */
    //@AfterReturning("pt1()")
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始执行记录日志了");
    }
    /**
     * 异常通知
     * @author yanbaohui
     * @date 2021/4/25 20:37
     */
    //@AfterThrowing("pt1()")
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始执行记录日志了");
    }
    /**
     * 最终通知
     * @author yanbaohui
     * @date 2021/4/25 20:37
     */
    //@After("pt1()")
    public void afterPrintLog(){
        System.out.println("最终通知Logger类中的afterPrintLog方法开始执行记录日志了");
    }

    /**
     * 环绕通知
     *spring为我们提供的一种在代码中增强方法何时执行的方式
     * @author yanbaohui
     * @date 2021/4/25 20:57
     */
    @Around("pt1()")
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();//得到方法执行所需参数
            System.out.println("Logger类中的aroundPrintLog方法开始执行记录日志了。。前置");
            rtValue = pjp.proceed(args);//明确调用业务层方法
            System.out.println("Logger类中的aroundPrintLog方法开始执行记录日志了。。后置");
            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("Logger类中的aroundPrintLog方法开始执行记录日志了。。异常");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("Logger类中的aroundPrintLog方法开始执行记录日志了。。最终");
        }


    }
}
