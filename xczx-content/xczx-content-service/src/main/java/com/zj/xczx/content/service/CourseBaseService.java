package com.zj.xczx.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zj.xczx.base.model.PageParams;
import com.zj.xczx.base.model.PageResult;
import com.zj.xczx.content.model.dto.QueryCourseParamsDto;
import com.zj.xczx.content.model.po.CourseBase;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author itcast
 * @since 2023-06-26
 */
public interface CourseBaseService extends IService<CourseBase> {

    //课程分页查询
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParams);
}
