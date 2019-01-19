package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.DashBoard;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface DashBoardRepository extends MongoRepository<DashBoard,String> {
}
