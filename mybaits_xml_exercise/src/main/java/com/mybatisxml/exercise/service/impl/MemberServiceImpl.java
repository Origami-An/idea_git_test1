package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.pojo.Member;
import com.mybatisxml.exercise.mapper.MemberMapper;
import com.mybatisxml.exercise.service.MemberService;
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
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
