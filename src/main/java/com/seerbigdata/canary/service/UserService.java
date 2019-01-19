package com.seerbigdata.canary.service;

import com.seerbigdata.canary.entity.User;

/**
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface UserService {

    /**
     * Login.
     *
     * @param user the user
     * @author : huangguixin / 2019-01-19
     */
    User login(User user);

}
