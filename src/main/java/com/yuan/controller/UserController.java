package com.yuan.controller;

import com.yuan.domain.User;
import com.yuan.service.UserService;
import com.yuan.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public JsonData login(@RequestBody User user) {

        System.out.println("user=" + user.toString());

        String token = userService.login(user.getUsername(), user.getPwd());

        return token != null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");
    }

    @GetMapping("list")
    public JsonData list() {
        List<User> users = userService.userList();
        return JsonData.buildSuccess(users);
    }
}
