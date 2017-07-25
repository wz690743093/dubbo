package com.kdls.test;

import com.kdls.entity.User;
import com.kdls.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:client.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.getClass());
        for (int i = 0; i <10; i++) {
            System.out.println(userService.selectById("1"));
        }
    }
}
