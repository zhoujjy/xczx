package com.zj.xczx.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;

    @ApiModelProperty("每页大小")
    private Long pageSize =10L;

}
