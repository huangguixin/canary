package com.seerbigdata.canary.service;

import com.seerbigdata.canary.entity.ChartWarehouse;

import java.util.List;

/**
 * ChartWarehouseService
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ChartWarehouseService {

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    List<ChartWarehouse> findAll();


    /**
     * Save list.
     *
     * @param chartWarehouses the chart warehouses
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    List<ChartWarehouse> save(List<ChartWarehouse> chartWarehouses);

    /**
     * Find by id chart warehouse.
     *
     * @param id the id
     * @return the chart warehouse
     * @author : huangguixin / 2019-01-19
     */
    ChartWarehouse findById(String id);

}
