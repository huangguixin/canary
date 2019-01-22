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

    /**
     * Data source repository
     */
    @Autowired
    private DataSourceRepository dataSourceRepository;

    /**
     * Chart warehouse service
     */
    @Autowired
    private ChartWarehouseService chartWarehouseService;

    /**
     * Dash board service
     */
    @Autowired
    private DashBoardService dashBoardService;

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public List<DataSource> findAll(){
        return dataSourceRepository.findAll();
    }

    /**
     * Save list.
     *
     * @param dataSources the data sources
     * @return the list
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public List<DataSource> save(List<DataSource> dataSources){
        return dataSourceRepository.saveAll(dataSources);
    }

    /**
     * Find by id data source.
     *
     * @param id the id
     * @return the data source
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public DataSource findById(String id){
        Optional<DataSource> dataSource = dataSourceRepository.findById(id);
        return dataSource.get();
    }

    /**
     * Get init data init data.
     *
     * @return the init data
     * @author : huangguixin / 2019-01-22
     */
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

    /**
     * Delete all.
     *
     * @param ids the ids
     * @author : huangguixin / 2019-01-22
     */
    @Override
    public void deleteAll(List<String> ids) {
        dataSourceRepository.deleteAll(dataSourceRepository.findAllById(ids));
    }


}
