package com.kdls.test;

import com.kdls.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import java.io.IOException;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class TestUser {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo.xml");
        System.in.read();


    }
}
