package com.gyc.service.impl;

import com.gyc.dao.UserMapper;
import com.gyc.entity.User;
import com.gyc.service.UserService;
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
