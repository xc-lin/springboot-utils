package com.lxc.registerbean;

import com.lxc.registerbean.bean.autowired.MyUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RegisterBeanApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RegisterBeanApplication.class, args);
        System.out.println(run.getBean(MyUser.class).getAddress());

    }

}
