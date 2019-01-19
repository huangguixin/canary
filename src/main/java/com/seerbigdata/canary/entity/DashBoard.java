package com.seerbigdata.canary.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * DashBoard
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Data
public class DashBoard {

    /**
     * 标识
     */
    @Id
    private String id;

}
