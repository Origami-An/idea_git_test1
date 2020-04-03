package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.pojo.Role;
import com.mybatisxml.exercise.mapper.RoleMapper;
import com.mybatisxml.exercise.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
