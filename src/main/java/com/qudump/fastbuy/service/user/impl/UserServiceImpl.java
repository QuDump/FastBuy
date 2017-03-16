package com.qudump.fastbuy.service.user.impl;

import com.qudump.fastbuy.dao.user.UserDao;
import com.qudump.fastbuy.exception.MobilePhoneDuplicatedException;
import com.qudump.fastbuy.exception.UserNotFoundException;
import com.qudump.fastbuy.model.User;
import com.qudump.fastbuy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by daniel on 2017/3/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final int PAGE_SIZE = 20;
    private static final String SORT_BY_ID = "id";

    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> findUserByPageNum(int pageNum) {
        Sort sort = new Sort(Sort.Direction.ASC,SORT_BY_ID);
        Pageable pageable = new PageRequest(pageNum, PAGE_SIZE, sort);

        return userDao.findAll(pageable);
    }

    @Transactional
    @Override
    public User findUserById(Long id) {

        User user = userDao.findOne(id);
        if(null == user) {
            throw new UserNotFoundException();
        }
        return user;
    }

    @Transactional
    @Override
    public User saveUser(User user) {
        User existedUser = userDao.findUserByMobile(user.getMobile());
        if(null != existedUser) {
            throw new MobilePhoneDuplicatedException();
        }
        return userDao.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        User user = userDao.findOne(id);
        if(null == user) {
            throw new UserNotFoundException();
        }
        userDao.delete(id);
    }

    @Transactional
    @Override
    public User updateUser(User user) {
        User foundUser = userDao.findOne(user.getId());
        if(null == foundUser) {
            throw new UserNotFoundException();
        }
        foundUser = userDao.findUserByMobile(user.getMobile());
        if(null != foundUser) {
            throw new MobilePhoneDuplicatedException();
        }
        return userDao.save(user);
    }
}
