package com.qudump.fastbuy.exception;

/**
 * Created by daniel on 2017/3/16.
 */
public class ApiUserNotFoundExcption extends ApiException {

    public ApiUserNotFoundExcption() {
        this("用户不存在");
    }

    public ApiUserNotFoundExcption(String msg) {
        super(UserErrorCode.UserNotFoundErrorCode,msg,null);
    }
}
