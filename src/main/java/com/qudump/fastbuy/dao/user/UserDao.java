package com.qudump.fastbuy.dao.user;

import com.qudump.fastbuy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserDao extends JpaRepository<User,Long> {

    List<User> query(Map<String,Object> param);

    User findUserById(Long id);

    User saveUser(User user);

    void deleteUser(long id);

    User updateUser(User user);
}
