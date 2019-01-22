package com.seerbigdata.canary.validator;

import com.seerbigdata.canary.entity.DataSource;

import java.util.List;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public class DataSourceValidator {

    /**
     * Validator add data source boolean.
     *
     * @param dataSources the data sources
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorAddDataSource(List<DataSource> dataSources) {
        return validatorAddAndUpdateCommon(dataSources);
    }

    /**
     * Validator update data source boolean.
     *
     * @param dataSources the data sources
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorUpdateDataSource(List<DataSource> dataSources) {
        return validatorAddAndUpdateCommon(dataSources);
    }

    /**
     * Validator add and update common boolean.
     *
     * @param dataSources the data sources
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorAddAndUpdateCommon(List<DataSource> dataSources) {
        if (dataSources == null || dataSources.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Validator delete data source boolean.
     *
     * @param ids the ids
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorDeleteDataSource(List<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return false;
        }
        return true;
    }

}
