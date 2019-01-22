package com.seerbigdata.canary.validator;

import com.seerbigdata.canary.entity.Chart;

import java.util.List;

/**
 * ChartValidator
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public class ChartValidator {

    public static boolean validatorAddChart(List<Chart> charts) {
        return validatorAddAndUpdateCommon(charts);
    }

    public static boolean validatorUpdateChart(List<Chart> charts) {
        return validatorAddAndUpdateCommon(charts);
    }

    public static boolean validatorAddAndUpdateCommon(List<Chart> charts) {
        if (charts == null || charts.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean validatorDeleteChart(List<String> ids){
        if (ids == null || ids.isEmpty()) {
            return false;
        }
        return true;
    }

}
