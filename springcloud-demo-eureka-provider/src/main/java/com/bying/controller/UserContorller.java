package com.bying.controller;

import com.bying.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengkunxf@126.com
 * @date 2021/5/28 2:45 下午
 * @description
 */
@RestController
public class UserContorller {

    @RequestMapping(value = "/user", produces = {"application/json;charset=UTF-8"})
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, 23, "ck1"));
        userList.add(new User(2, 24, "ck1"));
        userList.add(new User(3, 25, "ck2"));
        return userList;
    }
}
