package com.moafmoar.testdemo.web;

import com.moafmoar.testdemo.pojo.User;
import com.moafmoar.testdemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Api(value = "用户操作相关API")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表集合",response = SecurityProperties.User.class,responseContainer = "List", notes = "备注:该请求为GET请求",produces = "application/json")
    @GetMapping(value = "/getuser")
    @ResponseBody
    public User index(Integer id) {

        return userService.getuser(id);
    }
}
