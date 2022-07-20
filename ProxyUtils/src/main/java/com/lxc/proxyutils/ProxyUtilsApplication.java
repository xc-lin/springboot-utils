package com.lxc.proxyutils;

import com.lxc.proxyutils.bean.UserService;
import com.lxc.proxyutils.proxy.ProxyFactoryTest;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProxyUtilsApplication {

    public static void main(String[] args) {

        // ProxyFactoryTest.proxyFactoryTest();
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProxyUtilsApplication.class, args);
        UserService bean = applicationContext.getBean(UserService.class);
        bean.test(1);
    }





}
