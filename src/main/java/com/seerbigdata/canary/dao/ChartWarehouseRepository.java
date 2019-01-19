package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.ChartWarehouse;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ChartWarehouseRepository
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ChartWarehouseRepository extends MongoRepository<ChartWarehouse,String> {
}
