package com.mmz.dao;

import com.mmz.pojo.User;

import java.util.List;

/**
 * @Classname UserDao
 * @Description TODO
 * @Date 2020/5/4 21:31
 * @Created by mmz
 */
public interface UserDao {
    List<User> findAll();

    User findById(Integer id);


}
