package com.mybatisxml.exercise.service.impl;

import com.mybatisxml.exercise.pojo.Product;
import com.mybatisxml.exercise.mapper.ProductMapper;
import com.mybatisxml.exercise.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
