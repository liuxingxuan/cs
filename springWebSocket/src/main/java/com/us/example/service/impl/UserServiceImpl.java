package com.us.example.service.impl;

import com.us.example.bean.User;
import com.us.example.dao.UserMapper;
import com.us.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User getById(int userid) {
        User user = userMapper.getById(userid);
        return user;
    }
}
