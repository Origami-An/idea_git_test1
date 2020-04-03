package com.mybatisxml.exercise.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author origami
 * @since 2020-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("订单实体类")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @TableField("ORDERNUM")
    private String ordernum;

    @TableField("ORDERTIME")
    private Date ordertime;

    @TableField("PEOPLECOUNT")
    private Integer peoplecount;

    @TableField("ORDERDESC")
    private String orderdesc;

    @TableField("PAYTYPE")
    private Integer paytype;

    @TableField("ORDERSTATUS")
    private Integer orderstatus;

    @TableField("PRODUCTID")
    private String productid;

    @TableField("MEMBERID")
    private String memberid;

    @TableField(exist = false)
    private Product product;

}
