package com.us.example.service.impl;

import com.us.example.bean.Account;
import com.us.example.dao.AccountMapper;
import com.us.example.dto.AccountAddDTO;
import com.us.example.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> selectAll() {
        return accountMapper.selectAll();
    }

    @Override
    public Account getById(int AccountId) {
        Account account = accountMapper.getById(AccountId);
        return account;
    }

    @Override
    public void register(AccountAddDTO accountAddDTO) {
        Account account = new Account();
        account.setAccount(accountAddDTO.getAccount());
        account.setNickname(accountAddDTO.getNickname());
        account.setMobilenum(accountAddDTO.getMobilenum());
        account.setFaceid(accountAddDTO.getFaceid());
        account.setFacebookid(accountAddDTO.getFacebookid());
        account.setWeixinid(accountAddDTO.getWeixinid());
        account.setFaceurl(accountAddDTO.getFaceurl());
        account.setSex(accountAddDTO.getSex());
        account.setCountry(accountAddDTO.getCountry());
        account.setRegistertime(accountAddDTO.getRegistertime());
        account.setRegisterip(accountAddDTO.getRegisterip());
        account.setVersion(accountAddDTO.getVersion());
        account.setPlatform(accountAddDTO.getPlatform());
        account.setLanguage(accountAddDTO.getLanguage());
        account.setChannel(accountAddDTO.getChannel());
        account.setMobileid(accountAddDTO.getMobileid());
        account.setProtectpassword(accountAddDTO.getProtectpassword());
        account.setIp(accountAddDTO.getIp());
        account.setLogintime(accountAddDTO.getLogintime());
        account.setCurrentversion(accountAddDTO.getCurrentversion());
        account.setUsertype(accountAddDTO.getUsertype());
        account.setLogontype(accountAddDTO.getLogontype());
        account.setUpgradeaccount(accountAddDTO.getUpgradeaccount());
        //MD5处理
        account.setPassword(DigestUtils.md5DigestAsHex(accountAddDTO.getPassword().getBytes()));
        accountMapper.insert(account);



    }

    @Override
    public Account getByAccount(String account) {
        return accountMapper.getByAccount(account);
    }
}
