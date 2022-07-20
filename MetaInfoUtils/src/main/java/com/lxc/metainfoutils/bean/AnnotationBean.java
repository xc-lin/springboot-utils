package com.lxc.metainfoutils.bean;

import lombok.Data;
import org.springframework.core.annotation.Order;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
@Order(1)
public class AnnotationBean {
    private String name = "Bean1";
}
