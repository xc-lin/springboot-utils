package com.lxc.beanutils;

import com.lxc.beanutils.bean.Source;
import com.lxc.beanutils.bean.Target;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanUtilsApplication.class, args);
        Source source = new Source("111", "222");
        Target target = new Target();
        BeanUtils.copyProperties(source,target);
        System.out.println(target);
    }

}
