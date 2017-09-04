package com.loe.service;

import com.loe.dao.UserMapper;
import com.loe.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) throws Exception {
        userMapper.insertSelective(user);
        return 0;
    }
}
