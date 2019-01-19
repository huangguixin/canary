package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.ChartWarehouseRepository;
import com.seerbigdata.canary.entity.ChartWarehouse;
import com.seerbigdata.canary.service.ChartWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ChartWarehouseServiceImpl
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class ChartWarehouseServiceImpl implements ChartWarehouseService {

    /**
     * Chart warehouse repository
     */
    @Autowired
    private ChartWarehouseRepository chartWarehouseRepository;

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public List<ChartWarehouse> findAll() {
        return chartWarehouseRepository.findAll();
    }

    /**
     * Save chart warehouse.
     *
     * @param chartWarehouse the chart warehouse
     * @return the chart warehouse
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public ChartWarehouse save(ChartWarehouse chartWarehouse) {
        return chartWarehouseRepository.save(chartWarehouse);
    }

    /**
     * Find by id chart warehouse.
     *
     * @param id the id
     * @return the chart warehouse
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public ChartWarehouse findById(String id) {
        return chartWarehouseRepository.findById(id).get();
    }
}
