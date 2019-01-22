package com.seerbigdata.canary.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
@ApiModel("用户信息")
public class User {

    /**
     * Username
     */
    @ApiModelProperty(name = "username", value = "用户名")
    private String username;

    /**
     * Password
     */
    @ApiModelProperty(name = "password", value = "密码")
    private String password;

}
