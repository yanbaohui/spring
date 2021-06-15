package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @program: day02_eesy_04account_annoioc_withoutxml
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-21 22:39
 * 该类是一个配置类，它的作用和bean.xml是一样的
 * spring中的新注解
 * @Configuration
 *      作用：当前类是一个配置类
 *      细节：当配置类作为AnnotationConfigApplicationContext对象创建的参数时，该注解可以不写
 * @ComponentScan
 *      作用：用于通过注解指定spring在创建容器时要扫描的包
 *      属性：value：它和basePackages的作用是一样的，都是用于指定创建容器时扫描的包
 *                  我们使用等同于我们在xml中配置了 <context:component-scan base-package="com.itheima"></context:component-scan>
 * @bean
 *      作用：用于把当前的返回值作为bean对象存入容器中
 *      属性：
 *          name：用于指定bean的id。当不写时，默认值是当前方法的名称
 *      细节：当我们使用注解配置方法时，如果方法有参数，spring框架会去容器中查找有没有可用的bean对象。
 *            查找方式和@Autowired的方式一样
 *
 * @Import
 *      作用：用于导入其他的配置类
 *      属性：value：用于指定其他配置类的字节码
 *                   当我们使用import注解之后，有Import注解的类就是主配置或者父配置类，导入的是子配置类
 *
 *
 * @propertySource
 *      用于指定properties文件位置
 *      属性：value：指定文件名称和路径
 *              关键字：classpath：表示类路径下
 *
 **/

//@Configuration
//@ComponentScan({"com.itheima","config"})
@ComponentScan("com.itheima")
@Import(JdbConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {



}
