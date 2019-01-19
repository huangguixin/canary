package com.seerbigdata.canary.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.AssertFalse;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ResponseData {

    /**
     * Success
     */
    private boolean success;

    /**
     * Data
     */
    private Object data;

    /**
     * Success response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-18
     */
    public static ResponseData success(){
        return new ResponseData(true,null);
    }

    /**
     * Success response data.
     *
     * @param data the data
     * @return the response data
     * @author : huangguixin / 2019-01-18
     */
    public static ResponseData success(Object data){
        return new ResponseData(true,data);
    }

    /**
     * Error response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-18
     */
    public static ResponseData error(){
        return new ResponseData(false,null);
    }

    /**
     * Error response data.
     *
     * @param data the data
     * @return the response data
     * @author : huangguixin / 2019-01-18
     */
    public static ResponseData error(Object data){
        return new ResponseData(false,data);
    }
}
