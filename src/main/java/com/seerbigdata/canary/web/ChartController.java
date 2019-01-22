package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.Chart;
import com.seerbigdata.canary.service.ChartService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.ChartValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * ChartController
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
@Api(value = "Chart 信息", tags = "Chart 管理API")
public class ChartController {

    /**
     * Chart service
     */
    @Autowired
    private ChartService chartService;


    /**
     * Add chart response data.
     *
     * @param charts the charts
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @PostMapping("addChart")
    @ApiOperation(value = "新增 Chart", notes = "新增 Chart API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "charts", value = "chart 数组", required = true, dataType = "list"),
    })
    public ResponseData addChart(@RequestBody List<Chart> charts) {
        if(!ChartValidator.validatorAddChart(charts)){
            return ResponseData.error("图表数组不能为空");
        }
        charts = chartService.save(charts);
        return ResponseData.success(charts.stream().map(Chart::getId).collect(Collectors.toList()));
    }


    /**
     * Update chart response data.
     *
     * @param charts the charts
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @PutMapping("updateChart")
    @ApiOperation(value = "更新 Chart", notes = "更新 Chart API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "charts", value = "chart 数组", required = true, dataType = "list"),
    })
    public ResponseData updateChart(@RequestBody List<Chart> charts) {
        if(!ChartValidator.validatorUpdateChart(charts)){
            return ResponseData.error("图表数组不能为空");
        }
        chartService.save(charts);
        return ResponseData.success();
    }

    /**
     * Delete chart response data.
     *
     * @param ids the ids
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @DeleteMapping("deleteChart")
    @ApiOperation(value = "删除 Chart", notes = "删除 Chart API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "chart 数组编号", required = true, dataType = "list"),
    })
    public ResponseData deleteChart(@RequestBody List<String> ids) {
        if(!ChartValidator.validatorDeleteChart(ids)){
            return ResponseData.error("图表编号数组不能为空");
        }
        chartService.deleteAll(ids);
        return ResponseData.success();
    }

    /**
     * Get chart list response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @GetMapping("getChartList")
    @ApiOperation(value = "获取 Chart", notes = "获取 Chart API")
    public ResponseData getChartList() {
        return ResponseData.success(chartService.findAll());
    }
}
