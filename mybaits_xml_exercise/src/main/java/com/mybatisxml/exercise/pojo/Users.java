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
import java.util.List;

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
@ApiModel(value="用户实体类", description="")
public class Users implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "UUID")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "md5 加密")
    private String password;

    @ApiModelProperty(value = "手机号")
    @TableField("phoneNum")
    private String phoneNum;

    @ApiModelProperty(value = "状态 账号是否开启 0关闭 1开启")
    @TableField("STATUS")
    private Integer status;

    @ApiModelProperty(value = "md5 加盐")
    private String salt;

    @TableField(exist = false)
    private List<Role> roleList;

}
