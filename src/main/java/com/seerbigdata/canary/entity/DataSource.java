package com.seerbigdata.canary.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * DataSource
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
public class DataSource {

    /**
     * 名称
     */
    private String name;

    /**
     * 标识
     */
    @Id
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * ResponseData
     */
    private ForeignDB foreignDB;
}
