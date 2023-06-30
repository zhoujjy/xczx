package com.zj.xczx.content.api;

import com.zj.xczx.base.model.PageParams;
import com.zj.xczx.base.model.PageResult;
import com.zj.xczx.content.model.dto.QueryCourseParamsDto;
import com.zj.xczx.content.model.po.CourseBase;
import com.zj.xczx.content.service.CourseBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "课程信息管理接口")
public class CourseBaseInfoController {

    @Autowired
    private CourseBaseService courseBaseService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams) {
        return courseBaseService.queryCourseBaseList(pageParams, queryCourseParams);
    }


}
