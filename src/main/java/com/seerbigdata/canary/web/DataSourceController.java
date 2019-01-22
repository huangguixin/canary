package com.seerbigdata.canary.web;

import com.seerbigdata.canary.dto.InitData;
import com.seerbigdata.canary.entity.DataSource;
import com.seerbigdata.canary.service.DataSourceService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.DataSourceValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
     * Add data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PostMapping("addDataSource")
    public ResponseData addDataSource(@RequestBody List<DataSource> dataSources) {
        if(!DataSourceValidator.validatorAddDataSource(dataSources)){
            return ResponseData.error("dataSources 不能为空");
        }
        dataSources = dataSourceService.save(dataSources);
        return ResponseData.success(dataSources.stream().map(DataSource::getId).collect(Collectors.toList()));
    }

    /**
     * Delete data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @DeleteMapping("deleteDataSource")
    public ResponseData deleteDataSource(@RequestBody List<String> ids) {
        if(!DataSourceValidator.validatorDeleteDataSource(ids)){
            return ResponseData.error("ids 不能为空");
        }
        dataSourceService.deleteAll(ids);
        return ResponseData.success();
    }

    /**
     * Update data source response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PutMapping("updateDataSource")
    public ResponseData updateDataSource(@RequestBody List<DataSource> dataSources) {
        if(!DataSourceValidator.validatorUpdateDataSource(dataSources)){
            return ResponseData.error("dataSources 不能为空");
        }
        dataSourceService.save(dataSources);
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
