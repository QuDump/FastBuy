package com.qudump.fastbuy.exception;

/**
 * Created by daniel on 2017/3/16.
 */
public class MobilePhoneDuplicatedException extends RuntimeException {
    public MobilePhoneDuplicatedException() {
        super("电话号码已存在");
    }
}
