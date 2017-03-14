package com.qudump.fastbuy.service.user.impl;

import com.qudump.fastbuy.dao.user.UserDao;
import com.qudump.fastbuy.model.User;
import com.qudump.fastbuy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 2017/3/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> query(Map<String, Object> param) {
        return null;
    }

    @Transactional
    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("test");
        user.setMobilePhone("13888888888");
        user.setAddress("北京中南海");
        return user;
    }

    @Transactional
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Transactional
    @Override
    public void deleteUser(long id) {

    }

    @Transactional
    @Override
    public User updateUser(User user) {
        return null;
    }
}
