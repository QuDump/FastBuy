package com.qudump.fastbuy.exception;

/**
 * Created by daniel on 2017/3/16.
 */
public class ApiException extends RuntimeException {

    protected Integer errorCode;
    protected Object data;

    public ApiException(Integer errorCode,String msg, Object data, Throwable e) {
        super(msg,e);
        this.errorCode = errorCode;
        this.data = data;
    }

    public ApiException(Integer errorCode, String msg, Object data) {
        this(errorCode, msg, data, null);
    }

    public ApiException(Integer errorCode, String msg) {
        this(errorCode, msg, null);
    }

    public ApiException(String msg, Throwable e) {
        this(null, msg, null, e);
    }

    public ApiException() {
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
