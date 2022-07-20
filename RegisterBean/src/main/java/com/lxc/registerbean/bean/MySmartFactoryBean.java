package com.lxc.registerbean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Component("orderService3")
public class MySmartFactoryBean implements SmartFactoryBean<OrderService> {
    @Override
    public OrderService getObject() throws Exception {
        return new OrderService();
    }

    @Override
    public Class<?> getObjectType() {
        return OrderService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public boolean isEagerInit() {
        return true;
    }
}
