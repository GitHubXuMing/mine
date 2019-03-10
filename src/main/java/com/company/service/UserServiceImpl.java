package com.company.service;

import com.company.framework.annotation.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "Username:SCOTT";
    }

}
