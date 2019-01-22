package com.seerbigdata.canary.web;

import com.seerbigdata.canary.entity.User;
import com.seerbigdata.canary.service.UserService;
import com.seerbigdata.canary.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * UserController
 *
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@RestController
@RequestMapping("api")
@Api(value = "用户信息(User)", tags = "用户管理API(User)")
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
    @ApiOperation(value = "登录", notes = "登录API")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "string")
    })
    public ResponseData login(@RequestBody @ApiIgnore User user){
        try {
          userService.login(user);
        }catch (Exception e){
         ResponseData.error();
        }
        return ResponseData.success();
    }

}
