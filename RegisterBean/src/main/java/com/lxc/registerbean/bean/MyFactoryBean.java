package com.lxc.registerbean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Component("orderService2")
public class MyFactoryBean implements FactoryBean<OrderService> {
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
}
