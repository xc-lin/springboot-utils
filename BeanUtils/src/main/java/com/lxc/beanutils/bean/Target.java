package com.lxc.beanutils.bean;

import lombok.Data;

/**
 * @author Frank_lin
 * @date 2022/7/20
 */
@Data
public class Target {
    private Long id;
    private String address;


    @Override
    public String toString() {
        return "Target{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
