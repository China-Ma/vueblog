package com.chinama.service.impl;

import com.chinama.entity.Blog;
import com.chinama.mapper.BlogMapper;
import com.chinama.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
