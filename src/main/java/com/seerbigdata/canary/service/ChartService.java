package com.seerbigdata.canary.service;


import com.seerbigdata.canary.entity.Chart;

import java.util.List;

/**
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface ChartService {

    /**
     * Find all list.
     *
     * @return the list
     * @author : huangguixin / 2019-01-19
     */
    List<Chart> findAll();


    /**
     * Save chart.
     *
     * @param charts the charts
     * @return the List<Chart>
     * @author : huangguixin / 2019-01-22
     */
    List<Chart> save(List<Chart> charts);

    /**
     * Find by id chart.
     *
     * @param id the id
     * @return the chart
     * @author : huangguixin / 2019-01-19
     */
    Chart findById(String id);

    /**
     * Delete all.
     *
     * @param ids the ids
     * @author : huangguixin / 2019-01-19
     */
    void deleteAll(List<String> ids);

}
