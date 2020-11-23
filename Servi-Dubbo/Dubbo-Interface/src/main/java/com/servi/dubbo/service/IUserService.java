package com.servi.dubbo.service;

import com.servi.dubbo.user.User;


public interface IUserService {

    public User addUser(User user);

    public User getUser(String userId);
}
