package com.qudump.fastbuy.dao.user;

import com.qudump.fastbuy.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by daniel on 2017/3/13.
 */
public interface UserDao extends PagingAndSortingRepository<User,Long> {

//    @Query(value = "SELECT * FROM User LIMIT :start, :max",nativeQuery = true)
//    Page<User> findUsersByPage(Pageable pageable);
//
//    User findUserById(Long id);
//
//    User save(User user);
//
//    void delete(Long id);

//    User update(User user);
}
