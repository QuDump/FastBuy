package com.qudump.fastbuy.controller;

import com.qudump.fastbuy.common.BaseController;
import com.qudump.fastbuy.model.User;
import com.qudump.fastbuy.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;

/**
 * Created by daniel on 2017/3/13.
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public ResponseEntity<List<User>> getUserList(@RequestParam(value = "offset",defaultValue = "0") long offset,
                                                  @RequestParam(value = "limit",defaultValue = MAX_LONG_AS_STRING) long limit) {
        List<User> userList;
        HashMap<String,Object> params = new HashMap<>();
        params.put("offset",offset);
        params.put("limit",limit);

        userList = userService.query(params);

        if(null == userList) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user;

        user = userService.findUserById(id);

        if(null == user) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
    public ResponseEntity<User> deleteUserById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        if(null == user) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public ResponseEntity<User> saveUser(@RequestBody User user, UriComponentsBuilder ucb) {

        User savedUser =  userService.saveUser(user);

        HttpHeaders headers = new HttpHeaders();
        URI locationUri = ucb.path("/user/").path(String.valueOf(savedUser.getId())).build().toUri();
        headers.setLocation(locationUri);

        return new ResponseEntity<User>(savedUser,headers,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User currentUser = userService.findUserById(id);

        if(null == currentUser) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        currentUser.setId(id);
        currentUser.setName(user.getName());
        currentUser.setMobilePhone(user.getMobilePhone());
        currentUser.setAddress(user.getAddress());
        userService.updateUser(currentUser);
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }

}
