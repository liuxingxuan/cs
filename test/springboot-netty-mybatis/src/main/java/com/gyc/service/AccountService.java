package com.gyc.service;

import com.gyc.dto.AccountAddDTO;
import com.gyc.entity.Account;

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
