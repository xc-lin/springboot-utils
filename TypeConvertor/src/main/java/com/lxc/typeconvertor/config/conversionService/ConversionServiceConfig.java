package com.lxc.typeconvertor.config.conversionService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.annotation.Order;

import java.util.Collections;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */

@Configuration
public class ConversionServiceConfig {
    @Bean
    public ConversionServiceFactoryBean conversionServiceFactoryBean(){
        ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToOrderServiceConverter()));
        return conversionServiceFactoryBean;
    }
}
