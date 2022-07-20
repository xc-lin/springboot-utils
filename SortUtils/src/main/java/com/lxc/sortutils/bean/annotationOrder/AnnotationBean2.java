package com.lxc.sortutils.bean.annotationOrder;

import com.lxc.sortutils.bean.AbstractBean;
import lombok.Data;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
@Order(2)
public class AnnotationBean2 extends AbstractBean {
    private String name = "Bean2";


}
