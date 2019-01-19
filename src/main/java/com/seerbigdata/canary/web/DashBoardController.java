package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.service.DashBoardService;
import com.seerbigdata.canary.util.ResponseData;
import org.hibernate.validator.internal.util.IdentitySet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DashBoardController
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;

    @PostMapping("addDashBoard")
    public ResponseData addDashBoard(@RequestBody DashBoard dashBoard){
        DashBoard save = dashBoardService.save(dashBoard);
        return ResponseData.success(save.getId());
    }

    @DeleteMapping("deleteDashBoard")
    public ResponseData deleteDashBoard(@RequestBody List<String> ids){
        try {
            dashBoardService.deleteAll(ids);
        }catch (Exception e){
            return ResponseData.error();
        }
        return ResponseData.success();
    }

    @PutMapping("updateDashBoard")
    public ResponseData updateDashBoard(@RequestBody DashBoard dashBoard){
        try {
            dashBoardService.save(dashBoard);
        }catch (Exception e){
            return ResponseData.error() ;
        }
        return ResponseData.success();
    }

    @GetMapping("getDashBoard")
    public ResponseData getDashBoard(){
        return ResponseData.success(dashBoardService.findAll());
    }

}
