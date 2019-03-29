package com.gyc.controller;

import com.alibaba.fastjson.JSON;
import com.gyc.dto.AccountAddDTO;
import com.gyc.entity.Account;

import com.gyc.exception.BackendClientException;
import com.gyc.service.impl.AccountServiceImpl;

import com.gyc.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping("/getById")
    public Account getById(@RequestParam int AccountId ){
        Account account = accountService.getById(AccountId);
        return account;
    }

    @PostMapping("/register")
    public void register(@RequestBody AccountAddDTO accountAddDTO){
        accountService.register(accountAddDTO);
    }

    @GetMapping("/login")
    public String login(String account, String password ) throws Exception {
        Account account1 = accountService.getByAccount(account);
        if(account1 == null){
            throw new BackendClientException("account isn't exist");
        }
        String inputpassword = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!account1.getPassword().equals(inputpassword)) {
            throw new BackendClientException("password isn't match");
        }
        String loginInfoStr = JSON.toJSONString(account1);//对象转换为字符串
//        String token = Base64.getEncoder().encodeToString(loginInfoStr.getBytes());//Base64转码
        String token = MD5Utils.MD5Encode(loginInfoStr,"utf8");//MD5加密
        return token;
    }
}
