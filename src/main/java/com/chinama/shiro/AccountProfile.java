package com.chinama.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AccountProfile
 * @Author China-Ma
 * @Date 2020/10/18 18:52
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
