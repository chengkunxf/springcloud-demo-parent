package com.bying.controller;

import com.bying.pojo.User;
import com.bying.service.UserService;
import com.bying.service.UserService2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengkunxf@126.com
 * @date 2021/5/28 2:45 下午
 * @description
 */
@RestController
public class UserContorller {

    @Resource
    public UserService userService;

    @Resource
    public UserService2 userService2;

    @RequestMapping(value = "/consumer", produces = {"application/json;charset=UTF-8"})
    public List<User> getUsers() {
        return userService.getUser();
    }

    @RequestMapping(value = "/consumer2", produces = {"application/json;charset=UTF-8"})
    public String getUsers2() {
        return userService2.getUser();
    }
}
