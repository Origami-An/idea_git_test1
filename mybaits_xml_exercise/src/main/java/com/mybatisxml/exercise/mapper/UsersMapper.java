package com.mybatisxml.exercise.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisxml.exercise.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface UsersMapper extends BaseMapper<Users> {

    Users getUserWithListRoleByUserId(String userId);

    Users getUserWithListRoleByUserId2(String userId);

    List<Users> getUserListWithRoleListByUserIdList(@Param("uids") List<String> uids);
}
