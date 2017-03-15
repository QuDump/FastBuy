package com.qudump.fastbuy.model;

import java.util.List;

/**
 * Created by daniel on 2017/3/15.
 */
public class ListResponse<T> extends Response<List<T>> {

    private int page;
    private int totalPage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
