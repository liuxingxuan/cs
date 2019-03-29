package com.us.example.dao;

import com.us.example.bean.Account;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    List<Account> selectAll();

    Account getById(int AccountiId);

    Account getByAccount(String account);
}