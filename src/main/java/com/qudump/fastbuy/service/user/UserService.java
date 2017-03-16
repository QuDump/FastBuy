package com.qudump.fastbuy.service.user;

import com.qudump.fastbuy.exception.MobilePhoneDuplicatedException;
import com.qudump.fastbuy.exception.UserNotFoundException;
import com.qudump.fastbuy.model.User;
import org.springframework.data.domain.Page;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserService {

    Page<User> findUserByPageNum(int pageNum);

    User findUserById(Long id) throws UserNotFoundException;

    User saveUser(User user) throws MobilePhoneDuplicatedException;

    void deleteUser(long id) throws UserNotFoundException;

    User updateUser(User user) throws UserNotFoundException,MobilePhoneDuplicatedException;
}
