package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.ChartRepository;
import com.seerbigdata.canary.entity.Chart;
import com.seerbigdata.canary.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartServiceImpl implements ChartService {

    @Autowired
    private ChartRepository chartRepository;

    @Override
    public List<Chart> findAll() {
        return chartRepository.findAll();
    }

    @Override
    public Chart save(Chart chart) {
        return chartRepository.save(chart);
    }

    @Override
    public Chart findById(String id) {
        return chartRepository.findById(id).get();
    }

    @Override
    public void deleteAll(List<String> ids) {
        chartRepository.deleteAll(chartRepository.findAllById(ids));
    }
}
