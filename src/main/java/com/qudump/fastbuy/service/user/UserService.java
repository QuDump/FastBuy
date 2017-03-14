package com.qudump.fastbuy.service.user;

import com.qudump.fastbuy.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserService {

    List<User> query(Map<String,Object> param);

    User findUserById(Long id);

    User saveUser(User user);

    void deleteUser(long id);

    User updateUser(User user);
}
