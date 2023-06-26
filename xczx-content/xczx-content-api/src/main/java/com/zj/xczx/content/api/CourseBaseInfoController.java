package com.zj.xczx.content.api;

import com.zj.xczx.base.model.PageParams;
import com.zj.xczx.base.model.PageResult;
import com.zj.xczx.content.model.dto.QueryCourseParamsDto;
import com.zj.xczx.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(tags = "课程信息管理接口")
public class CourseBaseInfoController {

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){

        return null;

    }


}
