package com.seerbigdata.canary.service;

import com.seerbigdata.canary.entity.ForeignDB;

import java.util.List;

/**
 * ForeignDBService
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ForeignDBService {

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    List<ForeignDB> findAll();


    /**
     * Save list.
     *
     * @param foreignDBS the foreign dbs
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    List<ForeignDB> save(List<ForeignDB> foreignDBS);

    /**
     * Find by id foreign db.
     *
     * @param id the id
     * @return the foreign db
     * @author : huangguixin / 2019-01-19
     */
    ForeignDB findById(String id);

}
