package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.pojo.Permission;
import com.mybatisxml.exercise.mapper.PermissionMapper;
import com.mybatisxml.exercise.service.PermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
