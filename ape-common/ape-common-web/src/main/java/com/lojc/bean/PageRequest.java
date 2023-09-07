package com.lojc.bean;

import lombok.Data;
import lombok.Setter;

import java.io.Serializable;

/*
 *@Auther Lojc
 *@Date 2023/9/7
 */
@Setter
public class PageRequest implements Serializable {

    private Long pageNo = 1L;

    private Long pageSize = 10L;

    public Long getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1L;
        }

        return pageNo;
    }


    public Long getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 10L;
        }
        return pageSize;
    }

}
