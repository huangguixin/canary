package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.ForeignDB;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ForeignDBRepository
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ForeignDBRepository extends MongoRepository<ForeignDB,String> {
}
