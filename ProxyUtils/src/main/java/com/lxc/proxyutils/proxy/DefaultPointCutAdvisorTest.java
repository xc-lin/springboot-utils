package com.lxc.proxyutils.proxy;

import com.lxc.proxyutils.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.reflect.Method;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Configuration
@Import(DefaultAdvisorAutoProxyCreator.class)
public class DefaultPointCutAdvisorTest {
    @Bean
    DefaultPointcutAdvisor defaultPointcutAdvisor(){
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
        defaultPointcutAdvisor.setPointcut(new Pointcut() {
            @Override
            public ClassFilter getClassFilter() {
                return clazz -> {
                    if (clazz== UserService.class){
                        return true;
                    }
                    return false;
                };
            }

            @Override
            public MethodMatcher getMethodMatcher() {
                return new MethodMatcher() {
                    @Override
                    public boolean matches(Method method, Class<?> targetClass) {
                        if ("test".equals(method.getName())){
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public boolean isRuntime() {
                        return false;
                    }

                    @Override
                    public boolean matches(Method method, Class<?> targetClass, Object... args) {
                        throw new UnsupportedOperationException("Illegal MethodMatcher usage");
                    }
                };
            }
        });
        defaultPointcutAdvisor.setAdvice((MethodInterceptor) invocation -> {
            Object proceed =null;
            try {
                System.out.println("before...DefaultAdvisorAutoProxyCreator...");
                proceed = invocation.proceed();
                System.out.println("afterReturning...DefaultAdvisorAutoProxyCreator...");
            }catch (Exception e){
                System.out.println("afterThrowing...DefaultAdvisorAutoProxyCreator....");
            }finally {
                System.out.println("after..DefaultAdvisorAutoProxyCreator..");
            }
            return proceed;
        });
        return defaultPointcutAdvisor;

    }
}
