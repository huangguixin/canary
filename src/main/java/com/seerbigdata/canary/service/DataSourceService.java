package com.seerbigdata.canary.service;

import com.seerbigdata.canary.dto.InitData;
import com.seerbigdata.canary.entity.DataSource;

import java.util.List;
import java.util.Optional;

/**
 * DataSourceService
 *
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface DataSourceService {

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    List<DataSource> findAll();

    /**
     * Save data source.
     *
     * @param dataSource the data source
     * @return the data source
     * @author : huangguixin / 2019-01-19
     */
    DataSource save(DataSource dataSource);

    /**
     * Find by id data source.
     *
     * @param id the id
     * @return the data source
     * @author : huangguixin / 2019-01-19
     */
    DataSource findById(String id);

    /**
     * Get init data init data.
     *
     * @return the init data
     * @author : huangguixin / 2019-01-19
     */
    InitData getInitData();


    /**
     * Delete all.
     *
     * @param ids the ids
     * @author : huangguixin / 2019-01-19
     */
    void deleteAll(List<String> ids);
}
