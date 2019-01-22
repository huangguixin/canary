package com.seerbigdata.canary.web;

import com.seerbigdata.canary.dto.InitData;
import com.seerbigdata.canary.entity.DataSource;
import com.seerbigdata.canary.service.DataSourceService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.DataSourceValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
@Api(value = "数据源信息(DataSource)", tags = "数据源管理API(DataSource)")
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
    @ApiOperation(value = "新增数据源", notes = "新增数据源API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dataSources", value = "数据源数组", required = true, dataType = "list"),
    })
    public ResponseData addDataSource(@RequestBody @ApiIgnore List<DataSource> dataSources) {
        if (!DataSourceValidator.validatorAddDataSource(dataSources)) {
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
    @ApiOperation(value = "删除数据源", notes = "删除数据源API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "数据源编号数组", required = true, dataType = "list"),
    })
    public ResponseData deleteDataSource(@RequestBody List<String> ids) {
        if (!DataSourceValidator.validatorDeleteDataSource(ids)) {
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
    @ApiOperation(value = "更新数据源", notes = "更新数据源API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dataSources", value = "数据源数组", required = true, dataType = "list"),
    })
    public ResponseData updateDataSource(@RequestBody List<DataSource> dataSources) {
        if (!DataSourceValidator.validatorUpdateDataSource(dataSources)) {
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
    @ApiOperation(value = "获取数据源", notes = "获取数据源API")
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
    @ApiOperation(value = "初始化数据源", notes = "初始化数据源API")
    public ResponseData getInitData() {
        InitData initData = dataSourceService.getInitData();
        return ResponseData.success(initData);
    }
}
