package com.yuan.service;

import com.yuan.domain.User;

import java.util.List;

public interface UserService {

    String login(String username, String pwd);
    List<User> userList();

}
