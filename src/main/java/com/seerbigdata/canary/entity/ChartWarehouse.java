package com.seerbigdata.canary.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * ChartWarehouse
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
public class ChartWarehouse {

    /**
     * 标识
     */
    @Id
    private String id;

}
