package com.chinama.service.impl;

import com.chinama.entity.User;
import com.chinama.mapper.UserMapper;
import com.chinama.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author China-Ma
 * @since 2020-10-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
