package com.mybatisxml.exercise.mapper;

import com.mybatisxml.exercise.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoleListByUserId(String userId);
}
