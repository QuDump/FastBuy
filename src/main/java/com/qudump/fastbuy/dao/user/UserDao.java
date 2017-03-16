package com.qudump.fastbuy.dao.user;

import com.qudump.fastbuy.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserDao extends PagingAndSortingRepository<User,Long> {

       User findUserByMobile(String phone);
}
