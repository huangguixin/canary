package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.User;
import com.seerbigdata.canary.service.UserService;
import com.seerbigdata.canary.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
public class UserController {

    /**
     * User service
     */
    @Autowired
    private UserService userService;

    /**
     * Login response data.
     *
     * @param user the user
     * @return the response data
     * @author : huangguixin / 2019-01-19
     */
    @PostMapping("login")
    public ResponseData login(@RequestBody User user){
        try {
          userService.login(user);
        }catch (Exception e){
         ResponseData.error();
        }
        return ResponseData.success();
    }

}
