package com.tao.sun.gmall.service.impl;

import com.taosun.gmal.entity.User;
import com.taosun.gmal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl {

    @Autowired
    UserService userService;

    public List<User> getUserInfos(){
        List<User> listUser = userService.getUserById(1L);
        return listUser;
    }
}
