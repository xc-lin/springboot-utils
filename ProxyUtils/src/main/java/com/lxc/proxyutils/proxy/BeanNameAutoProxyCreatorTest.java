package com.lxc.proxyutils.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
// @Configuration
public class BeanNameAutoProxyCreatorTest {
    @Bean
    public MethodInterceptor methodInterceptor(){
        return invocation -> {
            Object proceed =null;
            try {
                System.out.println("before...beanNameAutoProxyCreator...");
                proceed = invocation.proceed();
                System.out.println("afterReturning...beanNameAutoProxyCreator...");
            }catch (Exception e){
                System.out.println("afterThrowing...beanNameAutoProxyCreator....");
            }finally {
                System.out.println("after..beanNameAutoProxyCreator..");
            }
            return proceed;
        };
    }
    @Bean
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
        // 代理名为userSer开头的所有bean
        beanNameAutoProxyCreator.setBeanNames("userSer*");
        beanNameAutoProxyCreator.setInterceptorNames("methodInterceptor");
        return beanNameAutoProxyCreator;

    }
}
