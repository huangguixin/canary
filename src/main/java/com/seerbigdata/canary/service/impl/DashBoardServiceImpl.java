package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.DashBoardRepository;
import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DashBoardServiceImpl
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class DashBoardServiceImpl implements DashBoardService {

    /**
     * Dash board repository
     */
    @Autowired
    private DashBoardRepository dashBoardRepository;

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public List<DashBoard> findAll() {
        return dashBoardRepository.findAll();
    }

    /**
     * Save dash board.
     *
     * @param dashBoard the dash board
     * @return the dash board
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public DashBoard save(DashBoard dashBoard) {
        return dashBoardRepository.save(dashBoard);
    }

    /**
     * Find by id dash board.
     *
     * @param id the id
     * @return the dash board
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public DashBoard findById(String id) {
        return dashBoardRepository.findById(id).get();
    }

    @Override
    public void deleteAll(List<String> ids) {
        dashBoardRepository.deleteAll(dashBoardRepository.findAllById(ids));
    }
}
