package api.picksend.springboot.controller;

import api.picksend.springboot.model.User;
import api.picksend.springboot.model.UserLoginRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.web.server.ResponseStatusException;

@SpringBootTest
public class UserControllerTests {

    @Autowired
    private UserController controller;

    @Test
    void contextLoads() {
        Assert.notNull(controller, "Controller is null");
    }

    @Test
    void LoginSuccessTest() {
        UserLoginRequest validUser = new UserLoginRequest("sender@gmail.com", "test123");
        User user = controller.userLogin(validUser);
        assertTrue(user.getFirstName().contains("Mohammed"));
    }

    @Test
    void LoginFailureTest() {
        UserLoginRequest inValidUser = new UserLoginRequest("senderNotFound@gmail.com", "test123");
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> controller.userLogin(inValidUser));
        assertTrue(exception.getMessage().contains("USER_NOT_FOUND"));
    }
}
