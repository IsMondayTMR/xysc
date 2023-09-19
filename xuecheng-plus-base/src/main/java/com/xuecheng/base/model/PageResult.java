package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class PageResult<T> implements Serializable {
    private List<T> items;
    private Long counts;
    private Long page;
    private Long pageSize;

    public  PageResult(List<T> items, Long counts, Long page, Long pageSize){
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
