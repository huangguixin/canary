package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.DataSource;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * DataSourcerRepository
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface DataSourceRepository extends MongoRepository<DataSource,String>{
}
