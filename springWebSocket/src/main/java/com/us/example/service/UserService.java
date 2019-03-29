package com.us.example.service;

import com.us.example.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有数据
     *
     * @return
     */
    List<User> selectAll();

    User getById(int userid);
}
