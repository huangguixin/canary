package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.Chart;
import com.seerbigdata.canary.service.ChartService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.ChartValidator;
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
    public ResponseData getChartList() {
        return ResponseData.success(chartService.findAll());
    }
}
