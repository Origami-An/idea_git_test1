package com.mybatisxml.exercise.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@ApiModel(value="Traveller对象", description="")
public class Traveller implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("SEX")
    private String sex;

    @TableField("PHONENUM")
    private String phonenum;

    @TableField("CREDENTIALSTYPE")
    private Integer credentialstype;

    @TableField("CREDENTIALSNUM")
    private String credentialsnum;

    @TableField("TRAVELLERTYPE")
    private Integer travellertype;


}
