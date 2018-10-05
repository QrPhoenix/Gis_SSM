package com.gis.service.Impl;

import com.gis.db.dao.UserMapper;
import com.gis.db.model.User;

import com.gis.db.model.UserExample;
import com.gis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QXY on 2018/10/5.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*
     * 检验用户登录业务
     *
     */
    public User checkLogin(String username, String password) {
//        User user = new User();
//        user.setUsername(username);
//        UserExample userExample = new UserExample();
//        userExample.setOrderByClause(username);
        User user = userMapper.findByUsername(username);
//        System.out.println(users);
        if(user != null && user.getPassword().equals(password)){

            return user;
        }
        return null;
    }
}