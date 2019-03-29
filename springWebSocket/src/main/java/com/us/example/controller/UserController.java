package com.us.example.controller;

import com.us.example.bean.User;
import com.us.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getById")
    public User getById(@RequestParam int userid ){
        User user = userService.getById(userid);
        return user;
    }

    @PostMapping("/registy")
    public void add(@RequestBody User user){

    }
}
