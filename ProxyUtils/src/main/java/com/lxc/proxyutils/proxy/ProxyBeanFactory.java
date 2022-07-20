package com.lxc.proxyutils.proxy;

import com.lxc.proxyutils.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
// @Configuration
public class ProxyBeanFactory {
    /**
     * 返回一个factoryBean可以放入ioc容器中
     * @return
     */
    @Bean
    public ProxyFactoryBean proxyFactoryBean(){
        UserService userService = new UserService();

        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(userService);
        proxyFactoryBean.addAdvice((MethodInterceptor) invocation -> {
            Object proceed =null;
            try {
                System.out.println("before...proxyFactoryBean...");
                proceed = invocation.proceed();
                System.out.println("afterReturning...proxyFactoryBean...");
            }catch (Exception e){
                System.out.println("afterThrowing...proxyFactoryBean....");
            }finally {
                System.out.println("after..proxyFactoryBean..");
            }
            return proceed;
        });
        return proxyFactoryBean;

    }
}
