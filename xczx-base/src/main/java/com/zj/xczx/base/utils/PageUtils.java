package com.zj.xczx.base.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zj.xczx.base.model.PageResult;

public class PageUtils  {

    public static <T> PageResult<T> build(IPage<T> page){
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setPage(page.getCurrent());
        pageResult.setPageSize(page.getSize());
        pageResult.setCounts(page.getTotal());
        pageResult.setItems(page.getRecords());
        return pageResult;
    }


}
