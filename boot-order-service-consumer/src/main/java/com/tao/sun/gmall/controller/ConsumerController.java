package com.tao.sun.gmall.controller;

import com.tao.sun.gmall.service.impl.OrderServiceImpl;
import com.taosun.gmal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping(value = "queryUserInfo",method = RequestMethod.GET)
    public List<User> queryUserInfo(Long id){

        return orderService.getUserInfos();
    }
}
