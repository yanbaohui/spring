package com.itheima.cglib;

import com.itheima.proxy.IProducer;

/**
 * @program: day03_eesy_02proxy
 * @description
 * @author: 晏宝辉
 * @create: 2021-04-25 14:44
 *
 **/
public class Producer {

    /**
     * 销售
     * @author yanbaohui
     * @date 2021/4/25 14:58
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("销售产品，并拿到钱：" + money);

    }

    /**
     * 售后
     * @author yanbaohui
     * @date 2021/4/25 14:58
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱: " + money);
    }
}
