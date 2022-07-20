package com.lxc.typeconvertor.config.editor;

import com.lxc.typeconvertor.bean.OrderService;
import com.lxc.typeconvertor.config.conversionService.StringToOrderServiceConverter;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.beans.PropertyEditor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Configuration
public class EditorConfig {
    @Bean
    public CustomEditorConfigurer customEditorConfigurer(){
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        Map<Class<?>, Class<? extends PropertyEditor>> customEditors  = new HashMap<>();
        customEditors.put(OrderService.class,StringToOrderServicePropertyEditor.class);
        customEditorConfigurer.setCustomEditors(customEditors);
        return customEditorConfigurer;
    }
}
