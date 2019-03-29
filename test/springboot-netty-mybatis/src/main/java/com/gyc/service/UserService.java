package com.gyc.service;

import com.gyc.entity.Account;
import com.gyc.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 获取所有数据
     *
     * @return
     */
    List<Account> selectAll();

    User getById(int userid);
}
