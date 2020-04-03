package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.mapper.UsersMapper;
import com.mybatisxml.exercise.pojo.Users;
import com.mybatisxml.exercise.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper mapper;

    @Override
    public Users getUserWithListRoleByUserId(String userId) {
        Users user = mapper.getUserWithListRoleByUserId(userId);
        return user;
    }

    @Override
    public Users getUserWithListRoleByUserId2(String userId) {
        Users user = mapper.getUserWithListRoleByUserId2(userId);
        return user;
    }

    @Override
    public List<Users> getUserListWithRoleListByUserIdList(List<String> uids) {
        return mapper.getUserListWithRoleListByUserIdList(uids);
    }
}
