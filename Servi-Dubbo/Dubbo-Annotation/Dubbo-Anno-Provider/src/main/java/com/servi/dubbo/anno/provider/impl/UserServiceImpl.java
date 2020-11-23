package com.servi.dubbo.anno.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.servi.dubbo.service.IUserService;
import com.servi.dubbo.user.User;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User addUser(User user) {
        user.setUserId("" + System.currentTimeMillis());
        return user;
    }

    @Override
    public User getUser(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setName("Servi-Anno");
        user.setAge((short) 28);
        user.setSex(1);
        return user;
    }
}
