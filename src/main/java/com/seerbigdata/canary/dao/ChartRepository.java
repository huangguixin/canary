package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.Chart;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ChartRepository
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ChartRepository extends MongoRepository<Chart,String> {
}
