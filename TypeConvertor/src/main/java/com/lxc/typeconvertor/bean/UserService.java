package com.lxc.typeconvertor.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Service
@Data
public class UserService {
    @Value("123")
    private OrderService orderService;
}
