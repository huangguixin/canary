package com.seerbigdata.canary.validator;

import com.seerbigdata.canary.entity.DashBoard;

import java.util.List;

/**
 * DashBoardValidator
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public class DashBoardValidator {

    /**
     * Validator add dash board boolean.
     *
     * @param dashBoards the dash boards
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorAddDashBoard(List<DashBoard> dashBoards) {
        return validatorAddAndUpdateCommon(dashBoards);
    }

    /**
     * Validator update dash board boolean.
     *
     * @param dashBoards the dash boards
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorUpdateDashBoard(List<DashBoard> dashBoards) {
        return validatorAddAndUpdateCommon(dashBoards);
    }

    /**
     * Validator add and update common boolean.
     *
     * @param dashBoards the dash boards
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorAddAndUpdateCommon(List<DashBoard> dashBoards) {
        if (dashBoards == null || dashBoards.isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Validator delete dash board boolean.
     *
     * @param ids the ids
     * @return the boolean
     * @author : huangguixin / 2019-01-22
     */
    public static boolean validatorDeleteDashBoard(List<String> ids){
        if(ids == null || ids.isEmpty()){
            return false;
        }
        return true;
    }
}
