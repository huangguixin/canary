package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.Chart;
import com.seerbigdata.canary.entity.DataSource;
import com.seerbigdata.canary.service.ChartService;
import com.seerbigdata.canary.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @param chart the chart
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PostMapping("addChart")
    public ResponseData addChart(@RequestBody Chart chart) {
        Chart chart1 = chartService.save(chart);
        return ResponseData.success(chart1.getId());
    }

    /**
     * Update chart response data.
     *
     * @param chart the chart
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PutMapping("updateChart")
    public ResponseData updateChart(@RequestBody Chart chart) {
        try {
            Chart chart1 = chartService.save(chart);
        }catch (Exception e){
            return ResponseData.error();
        }
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
        try {
            chartService.deleteAll(ids);
        }catch (Exception e){
            return ResponseData.error();
        }
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
