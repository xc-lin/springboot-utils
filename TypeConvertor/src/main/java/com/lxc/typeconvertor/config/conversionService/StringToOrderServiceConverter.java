package com.lxc.typeconvertor.config.conversionService;

import com.lxc.typeconvertor.bean.OrderService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
public class StringToOrderServiceConverter implements ConditionalGenericConverter {
    @Override
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return sourceType.getType().equals(String.class)&& targetType.getType().equals(OrderService.class);
    }

    @Override
    public Set<ConvertiblePair> getConvertibleTypes() {
        return Collections.singleton(new ConvertiblePair(String.class, OrderService.class));
    }

    @Override
    public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        OrderService orderService = new OrderService();
        orderService.setOrderName((String) source);
        return orderService;
    }
}
