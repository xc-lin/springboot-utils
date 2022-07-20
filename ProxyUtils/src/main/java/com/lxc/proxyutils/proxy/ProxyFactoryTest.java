package com.lxc.proxyutils.proxy;

import com.lxc.proxyutils.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.stereotype.Component;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
public class ProxyFactoryTest {
    /**
     * 不需要使用spring
     */
    public static void proxyFactoryTest(){
        UserService userService = new UserService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(userService);
        proxyFactory.addAdvice((MethodInterceptor) invocation -> {
            Object proceed =null;
            try {
                System.out.println("before...proxyFactory...");
                proceed = invocation.proceed();
                System.out.println("afterReturning...proxyFactory...");
            }catch (Exception e){
                System.out.println("afterThrowing....proxyFactory...");
            }finally {
                System.out.println("after..proxyFactory..");
            }
            return proceed;
        });
        UserService proxy = (UserService) proxyFactory.getProxy();
        proxy.test(1);

    }
}
