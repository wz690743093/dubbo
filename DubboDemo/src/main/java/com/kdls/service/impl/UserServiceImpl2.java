package com.kdls.service.impl;

import com.kdls.entity.User;
import com.kdls.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
@Service("userService2")
public class UserServiceImpl2 implements UserService {
    public User selectById(String id) {
        System.out.println("调用了服务查询了id为"+id+"的用户信息");
        System.out.println("调用了第二组实现类++++++++222222222222222");
        return new User(id,"王子源222",new Date());
    }
}
