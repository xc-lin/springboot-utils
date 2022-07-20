package com.lxc.typeconvertor;

import com.lxc.typeconvertor.bean.OrderService;
import com.lxc.typeconvertor.bean.UserService;
import com.lxc.typeconvertor.config.conversionService.StringToOrderServiceConverter;
import com.lxc.typeconvertor.config.editor.StringToOrderServicePropertyEditor;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;

@SpringBootApplication
public class TypeConvertorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TypeConvertorApplication.class, args);
        // UserService bean = applicationContext.getBean(UserService.class);
        // System.out.println(bean.getOrderService());
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(new StringToOrderServiceConverter());
        SimpleTypeConverter simpleTypeConverter = new SimpleTypeConverter();
        simpleTypeConverter.registerCustomEditor(OrderService.class,new StringToOrderServicePropertyEditor());
        simpleTypeConverter.setConversionService(defaultConversionService);
        OrderService orderService = simpleTypeConverter.convertIfNecessary("1111", OrderService.class);
        System.out.println(orderService);
    }

}
