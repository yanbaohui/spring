package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: day03_eesy_05annotationAOP
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 21:30
 **/
@Configuration
@ComponentScan("com.itheima")
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
