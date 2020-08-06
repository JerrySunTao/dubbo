package com.taosun.gmal.service;

import com.taosun.gmal.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUserById(Long id);
}
