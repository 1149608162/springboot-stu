package com.yuan.mapper;

import com.yuan.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserMapper {

    private static Map<String, User> userMap =  new HashMap<String, User>();

    static {
        userMap.put("jack", new User(1, "jack", "123"));
        userMap.put("lw", new User(2, "lw", "123"));
        userMap.put("xdclass", new User(3, "xdclass", "123456"));
    }

    public User login(String username, String pwd) {
        User user = userMap.get(username);
        if (user == null) {
            return null;
        }

        if (user.getPwd().equals(pwd)) {
            return user;
        }

        return null;
    }

    public List<User> userList() {
        List<User> users = new ArrayList<>();
        users.addAll(userMap.values());
        return users;
    }

}
