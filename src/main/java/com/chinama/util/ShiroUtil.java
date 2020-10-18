package com.chinama.util;

import com.chinama.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @ClassName ShiroUtil
 * @Author China-Ma
 * @Date 2020/10/18 19:36
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}