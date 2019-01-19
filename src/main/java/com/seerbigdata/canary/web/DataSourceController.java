package com.seerbigdata.canary.web;

import com.seerbigdata.canary.dto.InitData;
import com.seerbigdata.canary.entity.DataSource;
import com.seerbigdata.canary.service.DataSourceService;
import com.seerbigdata.canary.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
public class DataSourceController {

    /**
     * Data source service
     */
    @Autowired
    private DataSourceService dataSourceService;

    /**
     * Find all response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @GetMapping("getDataSourceList")
    public ResponseData findAll() {
        List<DataSource> dataSources = dataSourceService.findAll();
        return ResponseData.success(dataSources);
    }

    /**
     * Add or update response data.
     *
     * @param dataSource the data source
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PostMapping("postDataSource")
    public ResponseData addOrUpdate(@RequestBody DataSource dataSource) {
        return ResponseData.success(dataSourceService.save(dataSource));
    }

    /**
     * Add data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PostMapping("addDataSource")
    public ResponseData addDataSource(@RequestBody DataSource dataSource) {
        DataSource dataSource1 = dataSourceService.save(dataSource);
        return ResponseData.success(dataSource1.getId());
    }

    /**
     * Delete data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @DeleteMapping("deleteDataSource")
    public ResponseData deleteDataSource(@RequestBody List<String> ids) {

        try {
            dataSourceService.deleteAll(ids);
        }catch (Exception e){
            return ResponseData.error();
        }
        return ResponseData.success();
    }

    /**
     * Update data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PutMapping("updateDataSource")
    public ResponseData updateDataSource(@RequestBody DataSource dataSource) {
        try {
            dataSourceService.save(dataSource);
        }catch (Exception e){
            return ResponseData.error();
        }
        return ResponseData.success();
    }

    /**
     * Get data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @GetMapping("getDataSource")
    public ResponseData getDataSource() {
        return ResponseData.success(dataSourceService.findAll());
    }

    /**
     * Get init data response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @GetMapping("getInitData")
    public ResponseData getInitData() {
        InitData initData = dataSourceService.getInitData();
        return ResponseData.success(initData);
    }
}
