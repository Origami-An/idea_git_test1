package com.mybatisxml.exercise.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
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
@ApiModel("商品实体类")
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty("商品ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @ApiModelProperty("商品编号")
    @TableField("PRODUCTNUM")
    private String productnum;

    @ApiModelProperty("商品名称")
    @TableField("PRODUCTNAME")
    private String productname;

    @ApiModelProperty("发货城市")
    @TableField("CITYNAME")
    private String cityname;

    @ApiModelProperty("发货时间")
    @TableField("DEPARTURETIME")
    private Date departuretime;

    @ApiModelProperty("商品价格")
    @TableField("PRODUCTPRICE")
    private BigDecimal productprice;

    @ApiModelProperty("商品描述")
    @TableField("PRODUCTDESC")
    private String productdesc;

    @ApiModelProperty("商品状态")
    @TableField("PRODUCTSTATUS")
    private Integer productstatus;


}
