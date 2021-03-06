package com.moafmoar.testdemo.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan
@RestController
@RequestMapping(value = "/city")
@Api(value = "用户操作相关API")
public class HelloWordController {
    private Logger logger = LoggerFactory.getLogger(HelloWordController.class);

    @ApiOperation(value = "获取用户列表集合",response = SecurityProperties.User.class,responseContainer = "List", notes = "备注:该请求为GET请求",produces = "application/json")
    @GetMapping(value = "/hello")
    public String index() {
        return "Hello World";
    }

}