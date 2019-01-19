package com.seerbigdata.canary.dto;

import com.seerbigdata.canary.entity.ChartWarehouse;
import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.entity.DataSource;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
@Accessors(chain = true)
public class InitData {

    /**
     * Chart warehouses
     */
    private List<ChartWarehouse> chartWarehouse;

    /**
     * Dash boards
     */
    private List<DashBoard> dashBoardList;

    /**
     * Data sources
     */
    private List<DataSource> dataSource;

}
