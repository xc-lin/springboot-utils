package com.lxc.beanutils.bean;

import lombok.Data;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
public class Source {
    private String id;
    private String address;

    public Source(String id, String address) {
        this.id = id;
        this.address = address;
    }
}
