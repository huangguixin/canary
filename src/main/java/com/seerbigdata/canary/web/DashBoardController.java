package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.DashBoard;
import com.seerbigdata.canary.service.DashBoardService;
import com.seerbigdata.canary.util.ResponseData;
import com.seerbigdata.canary.validator.DashBoardValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.internal.util.IdentitySet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

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
@Api(value = "DashBoard信息", tags = "DashBoard管理API")
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
    @ApiOperation(value = "新增DashBoard", notes = "新增DashBoard API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dashBoards", value = "DashBoard数组", required = true, dataType = "list"),
    })
    public ResponseData addDashBoard(@RequestBody @ApiIgnore List<DashBoard> dashBoards) {
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
    @ApiOperation(value = "删除DashBoard", notes = "删除DashBoard API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "ids", value = "DashBoard数组编号", required = true, dataType = "list"),
    })
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
    @ApiOperation(value = "更新DashBoard", notes = "更新DashBoard API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dashBoards", value = "DashBoard数组", required = true, dataType = "list"),
    })
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
    @ApiOperation(value = "获取DashBoard", notes = "获取DashBoard API")
    public ResponseData getDashBoard() {
        return ResponseData.success(dashBoardService.findAll());
    }

}
