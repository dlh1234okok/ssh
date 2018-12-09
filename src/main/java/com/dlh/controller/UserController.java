package com.dlh.controller;

import com.dlh.entity.User;
import com.dlh.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("user/{userId}")
    public User queryUserByUserId(@PathVariable Integer userId){
        return userService.queryUsrByUserId(userId);
    }
}
