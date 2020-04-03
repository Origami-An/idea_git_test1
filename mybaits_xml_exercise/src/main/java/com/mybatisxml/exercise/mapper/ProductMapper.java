package com.mybatisxml.exercise.mapper;

import com.mybatisxml.exercise.pojo.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
public interface ProductMapper extends BaseMapper<Product> {

    Product getProductByOrderId(String productId);
}
