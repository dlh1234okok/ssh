package com.dlh.service;

import com.dlh.dao.UserDao;
import com.dlh.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;


    public User queryUsrByUserId(Integer userId){
        return userDao.queryUserById(userId);
    }

}
