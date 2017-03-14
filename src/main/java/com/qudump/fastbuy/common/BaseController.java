package com.qudump.fastbuy.common;

import com.google.gson.Gson;

/**
 * Created by daniel on 2017/3/13.
 */
public class BaseController {
    public static final String FAILD = "faild";
    public static final String SUCCESS = "success";
    protected static final String MAX_LONG_AS_STRING = "9223372036854775807";
    /**
     * gson是线程安全的
     */
    protected static final Gson gson = new Gson();
//    /**
//     * 日志
//     */
//    protected Logger logger = Logger.getLogger(this.getClass());
}
