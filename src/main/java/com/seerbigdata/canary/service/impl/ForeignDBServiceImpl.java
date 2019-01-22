package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.ForeignDBRepository;
import com.seerbigdata.canary.entity.ForeignDB;
import com.seerbigdata.canary.service.ForeignDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * ForeignDBServiceImpl
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class ForeignDBServiceImpl implements ForeignDBService {

    /**
     * Foreign db repository
     */
    @Autowired
    private ForeignDBRepository foreignDBRepository;

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public List<ForeignDB> findAll(){
       return foreignDBRepository.findAll();
    }

    /**
     * Save list.
     *
     * @param foreignDBS the foreign dbs
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public List<ForeignDB> save(List<ForeignDB> foreignDBS) {
        return foreignDBRepository.saveAll(foreignDBS);
    }

    /**
     * Find by id foreign db.
     *
     * @param id the id
     * @return the foreign db
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public ForeignDB findById(String id){
        Optional<ForeignDB> foreignDB = foreignDBRepository.findById(id);
        return foreignDB.get();
    }

}
