package com.gyc.dao;

import com.gyc.entity.Account;
import com.gyc.entity.User;

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