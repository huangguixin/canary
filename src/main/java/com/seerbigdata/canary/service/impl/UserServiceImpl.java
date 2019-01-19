package com.seerbigdata.canary.service.impl;

import com.seerbigdata.canary.dao.UserRepository;
import com.seerbigdata.canary.entity.User;
import com.seerbigdata.canary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * User repository
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Login user.
     *
     * @param user the user
     * @return the user
     * @author : huangguixin / 2019-01-19
     */
    @Override
    public User login(User user) {
      return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

}
