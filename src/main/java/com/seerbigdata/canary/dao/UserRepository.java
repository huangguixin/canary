package com.seerbigdata.canary.dao;

import com.seerbigdata.canary.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : huangguixin / huangguixin@seerbigdata.com
 * @version : 1.0
 */
public interface UserRepository extends MongoRepository<User,String> {


    /**
     * Find by username and password user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     * @author : huangguixin / 2019-01-19
     */
    User findByUsernameAndPassword(String username,String password);

}
