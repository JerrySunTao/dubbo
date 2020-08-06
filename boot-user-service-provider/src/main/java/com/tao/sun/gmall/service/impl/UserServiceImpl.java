package com.tao.sun.gmall.service.impl;

import com.taosun.gmal.entity.User;
import com.taosun.gmal.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserById(Long id) {
        List<User> listUser = new ArrayList();
        //模拟返回结果
        User user1= new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setCompany("红星云人事部");
        user1.setEmail("zhangsan@qq.com");

        User user2= new User();
        user2.setId(2L);
        user2.setName("李四");
        user2.setCompany("红星云人事部");
        user2.setEmail("lisi@qq.com");

        listUser.add(user1);
        listUser.add(user2);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listUser;
    }
}
