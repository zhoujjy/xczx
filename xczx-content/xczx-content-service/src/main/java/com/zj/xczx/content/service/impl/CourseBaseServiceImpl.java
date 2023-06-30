package com.zj.xczx.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zj.xczx.base.model.PageParams;
import com.zj.xczx.base.model.PageResult;
import com.zj.xczx.base.utils.PageUtils;
import com.zj.xczx.content.mapper.CourseBaseMapper;
import com.zj.xczx.content.model.dto.QueryCourseParamsDto;
import com.zj.xczx.content.model.po.CourseBase;
import com.zj.xczx.content.service.CourseBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 课程基本信息 服务实现类
 * </p>
 *
 * @author itcast
 */
@Slf4j
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBase> implements CourseBaseService {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Override
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParams) {

        Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
        Page<CourseBase> courseBasePage = courseBaseMapper.selectPage(page, new LambdaQueryWrapper<CourseBase>()
                .like(!StringUtils.isEmpty(courseParams.getCourseName()), CourseBase::getName, courseParams.getCourseName())
                .eq(!StringUtils.isEmpty(courseParams.getAuditStatus()), CourseBase::getAuditStatus, courseParams.getAuditStatus())
                .eq(!StringUtils.isEmpty(courseParams.getPublishStatus()), CourseBase::getStatus, courseParams.getPublishStatus())
        );
        return PageUtils.build(courseBasePage);
    }
}
