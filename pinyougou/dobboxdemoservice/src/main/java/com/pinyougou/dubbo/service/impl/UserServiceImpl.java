package com.pinyougou.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.dubbo.service.UserService;

/**
 * @author caiwen
 * @version 1.0
 * @date 2018-10-14
 * @describetion TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "dubbo环境搭建成功！";
    }
}
