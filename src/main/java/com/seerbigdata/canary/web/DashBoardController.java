package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.service.DashBoardService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.DashBoardValidator;
import org.hibernate.validator.internal.util.IdentitySet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * DashBoardController
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
public class DashBoardController {

    /**
     * Dash board service
     */
    @Autowired
    private DashBoardService dashBoardService;

    /**
     * Add dash board response data.
     *
     * @param dashBoards the dash boards
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @PostMapping("addDashBoard")
    public ResponseData addDashBoard(@RequestBody List<DashBoard> dashBoards) {
        if (!DashBoardValidator.validatorAddDashBoard(dashBoards)) {
            return ResponseData.error("dashBoards 不能为空");
        }
        dashBoards = dashBoardService.save(dashBoards);
        return ResponseData.success(dashBoards.stream().map(DashBoard::getId).collect(Collectors.toList()));
    }

    /**
     * Delete dash board response data.
     *
     * @param ids the ids
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @DeleteMapping("deleteDashBoard")
    public ResponseData deleteDashBoard(@RequestBody List<String> ids) {
        if (!DashBoardValidator.validatorDeleteDashBoard(ids)) {
            return ResponseData.error("ids 不能为空");
        }
        dashBoardService.deleteAll(ids);
        return ResponseData.success();
    }

    /**
     * Update dash board response data.
     *
     * @param dashBoards the dash boards
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @PutMapping("updateDashBoard")
    public ResponseData updateDashBoard(@RequestBody List<DashBoard> dashBoards) {
        if (!DashBoardValidator.validatorUpdateDashBoard(dashBoards)) {
            return ResponseData.error("dashBoards 不能为空");
        }
        dashBoardService.save(dashBoards);
        return ResponseData.success();
    }

    /**
     * Get dash board response data.
     *
     * @return the response data
     * @author : huangguixin / 2019-01-22
     */
    @GetMapping("getDashBoard")
    public ResponseData getDashBoard() {
        return ResponseData.success(dashBoardService.findAll());
    }

}
