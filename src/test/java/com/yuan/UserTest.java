package com.yuan;

import com.yuan.controller.UserController;
import com.yuan.domain.User;
import com.yuan.utils.JsonData;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoProjectApplication.class})
public class UserTest {

    @Autowired
    private UserController userController;

    @Test
    public void loginTest() {
        User user = new User();
        user.setUsername("ydg");
        user.setPwd("123");

        JsonData login = userController.login(user);

        TestCase.assertEquals(0, login.getCode());

    }

}
