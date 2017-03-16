package com.qudump.fastbuy.exception;

/**
 * Created by daniel on 2017/3/16.
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {
        super("不存在该用户");
    }
}

