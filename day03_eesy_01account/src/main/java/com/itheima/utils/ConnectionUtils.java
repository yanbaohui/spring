package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @program: day03_eesy_01account
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-24 19:43
 * 连接的工具类，它用于从数据源中获取一个连接，并且实现和线程的绑定
 *
 **/
public class ConnectionUtils {
    private ThreadLocal<Connection> tl = new ThreadLocal<>();


    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        Connection coon = tl.get();
        //判断当前线程上是否有连接
        if (coon == null){
            //从数据源中获取一个连接，并且与线程绑定
            try {
                coon = dataSource.getConnection();
                tl.set(coon);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        return coon;
    }

    //把连接和线程解绑
    public void removeConnection(){
        tl.remove();
    }
}
