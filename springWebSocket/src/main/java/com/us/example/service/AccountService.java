package com.us.example.service;

import com.us.example.bean.Account;
import com.us.example.dto.AccountAddDTO;

import java.util.List;

public interface AccountService {
    /**
     * 获取所有数据
     *
     * @return
     */
    List<Account> selectAll();

    Account getById(int AccountId);

    void register(AccountAddDTO accountAddDTO);

    Account getByAccount(String account);
}
