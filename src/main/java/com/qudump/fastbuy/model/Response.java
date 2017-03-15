package com.qudump.fastbuy.model;

import java.io.Serializable;

/**
 * Created by daniel on 2017/3/15.
 */
public class Response<T> implements Serializable {
    private String msg;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
