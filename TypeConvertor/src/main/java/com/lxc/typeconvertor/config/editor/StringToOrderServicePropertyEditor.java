package com.lxc.typeconvertor.config.editor;

import com.lxc.typeconvertor.bean.OrderService;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Component
public class StringToOrderServicePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        OrderService orderService = new OrderService();
        orderService.setOrderName(text);
        this.setValue(orderService);
    }
}
