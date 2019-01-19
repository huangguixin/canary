package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.ForeignDBRepository;
import com.seerbigdata.canary.entity.ForeignDB;
import com.seerbigdata.canary.service.ForeignDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**ForeignDBServiceImpl
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class ForeignDBServiceImpl implements ForeignDBService {

    @Autowired
    private ForeignDBRepository foreignDBRepository;

    @Override
    public List<ForeignDB> findAll(){
       return foreignDBRepository.findAll();
    }

    @Override
    public ForeignDB save(ForeignDB foreignDB){
         return foreignDBRepository.save(foreignDB);
    }

    @Override
    public ForeignDB findById(String id){
        Optional<ForeignDB> foreignDB = foreignDBRepository.findById(id);
        return foreignDB.get();
    }

}
