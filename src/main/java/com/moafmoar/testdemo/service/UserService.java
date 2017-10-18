package com.moafmoar.testdemo.service;

import com.moafmoar.testdemo.dao.UserMapper;
import com.moafmoar.testdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User getuser(Integer id){
     return userMapper.selectByPrimaryKey(id);
    }
}
