package com.lxc.sortutils.bean.ImplOrdered;

import com.lxc.sortutils.bean.AbstractBean;
import lombok.Data;
import org.springframework.core.Ordered;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
public class Bean2 extends AbstractBean implements Ordered {
    private String name = "Bean2";

    @Override
    public int getOrder() {
        return 2;
    }
}
