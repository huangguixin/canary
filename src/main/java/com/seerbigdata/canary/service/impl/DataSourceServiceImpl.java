package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.DataSourceRepository;
import com.seerbigdata.canary.dto.InitData;
import com.seerbigdata.canary.entity.ChartWarehouse;
import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.entity.DataSource;
import com.seerbigdata.canary.service.ChartWarehouseService;
import com.seerbigdata.canary.service.DashBoardService;
import com.seerbigdata.canary.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * DataSourceServiceImpl
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    private DataSourceRepository dataSourceRepository;

    @Autowired
    private ChartWarehouseService chartWarehouseService;

    @Autowired
    private DashBoardService dashBoardService;

    @Override
    public List<DataSource> findAll(){
        return dataSourceRepository.findAll();
    }

    @Override
    public DataSource save(DataSource dataSource){
        return dataSourceRepository.save(dataSource);
    }

    @Override
    public DataSource findById(String id){
        Optional<DataSource> dataSource = dataSourceRepository.findById(id);
        return dataSource.get();
    }

    @Override
    public InitData getInitData() {

        List<ChartWarehouse> chartWarehouses = new ArrayList<>();
        List<DataSource> dataSources = new ArrayList<>();
        List<DashBoard> dashBoards = new ArrayList<>();
        InitData initData = new InitData();
        initData.setChartWarehouse(chartWarehouses)
                .setDashBoardList(dashBoards)
                .setDataSource(dataSources);
        return initData;
    }

    @Override
    public void deleteAll(List<String> ids) {
        dataSourceRepository.deleteAll(dataSourceRepository.findAllById(ids));
    }


}
