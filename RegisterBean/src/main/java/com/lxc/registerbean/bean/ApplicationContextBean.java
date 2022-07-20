package com.lxc.registerbean.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Component
public class ApplicationContextBean {
    @Autowired
    AnnotationConfigApplicationContext applicationContext;

    @PostConstruct
    public void test(){
        // applicationContext.register(User.class);
        applicationContext.registerBean("orderService4",OrderService.class,()->new OrderService());
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(OrderService.class);
        applicationContext.registerBeanDefinition("orderService5",beanDefinition);
    }
}
