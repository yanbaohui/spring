package com.itheima.proxy;

/**
 * @program: day03_eesy_02proxy
 * @description
 * @author: yanbaohui
 * @create: 2021-04-25 14:59
 * 对生产厂家要求的接口
 **/
public interface IProducer {

    /**
     * 销售
     * @author yanbaohui
     * @date 2021/4/25 14:58
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @author yanbaohui
     * @date 2021/4/25 14:58
     * @param money
     */
    public void afterService(float money);

}
