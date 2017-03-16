package com.qudump.fastbuy.exception;

/**
 * Created by daniel on 2017/3/16.
 */
public class ApiMobielDuplicatedException extends ApiException {
    public ApiMobielDuplicatedException(String msg) {
        super(UserErrorCode.UserMobileDuplicatedErrorCode,msg);
    }

    public ApiMobielDuplicatedException() {
        this("用户的电话号码已存在");
    }
}
