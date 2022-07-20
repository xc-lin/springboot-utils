package com.lxc.resourceutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class ResourceUtilsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ResourceUtilsApplication.class, args);
        Resource resource = applicationContext.getResource("classpath:banner.txt");
        System.out.println(resource.getFilename());
    }

}
