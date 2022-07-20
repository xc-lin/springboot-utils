package com.lxc.typeconvertor.bean;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
@Service
public class OrderService {
    private String orderName;
}
