package com.mybatisxml.exercise.service;

import com.mybatisxml.exercise.pojo.Users;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface UsersService{

    Users getUserWithListRoleByUserId(String userId);

    Users getUserWithListRoleByUserId2(String userId);

    List<Users> getUserListWithRoleListByUserIdList(List<String> uids);
}
