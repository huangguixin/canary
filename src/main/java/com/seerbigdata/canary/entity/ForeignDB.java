package com.seerbigdata.canary.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * ForeignDB
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
public class ForeignDB {

    /**
     * 数据库类型
     */
    private String type;

    /**
     * 标识
     */
    @Id
    private String id;

    /**
     * 主机
     */
    private String host;

    /**
     * 端口号
     */
    private String port;

    /**
     * 密码
     */
    private String password;

}
