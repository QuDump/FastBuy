package com.qudump.fastbuy.service.user;

import com.qudump.fastbuy.model.User;
import org.springframework.data.domain.Page;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserService {

    Page<User> findUserByPageNum(int pageNum);

    User findUserById(Long id);

    User saveUser(User user);

    void deleteUser(long id);

    User updateUser(User user);
}
