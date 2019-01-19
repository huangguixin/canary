package com.seerbigdata.canary.service;

import com.seerbigdata.canary.entity.DashBoard;

import java.util.List;

/**
 * DashBoardService
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface DashBoardService {

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    List<DashBoard> findAll();

    /**
     * Save dash board.
     *
     * @param dashBoard the dash board
     * @return the dash board
     * @author : huangguixin / 2019-01-19
     */
    DashBoard save(DashBoard dashBoard);

    /**
     * Find by id dash board.
     *
     * @param id the id
     * @return the dash board
     * @author : huangguixin / 2019-01-19
     */
    DashBoard findById(String id);

    /**
     * Delete all.
     *
     * @param ids the ids
     * @author : huangguixin / 2019-01-19
     */
    void deleteAll(List<String> ids);
}
