package com.mybatisxml.exercise.controller;


import com.mybatisxml.exercise.pojo.Users;
import com.mybatisxml.exercise.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/getUser/{userId}")
    public Users getUserWithListRoleByUserId(@PathVariable String userId) {
        Users user = service.getUserWithListRoleByUserId(userId);
        return user;
    }

    @GetMapping("/getUser2/{userId}")
    public Users getUserWithListRoleByUserId2(@PathVariable String userId) {
        Users user = service.getUserWithListRoleByUserId2(userId);
        return user;
    }

    @GetMapping("/getUserList/{userIdList}")
    public List<Users> getUserListWithRoleListByUserIdList(
            @PathVariable("userIdList")List<String> uids
    ){
        List<Users> usersList = service.getUserListWithRoleListByUserIdList(uids);
        return usersList;
    }
}

