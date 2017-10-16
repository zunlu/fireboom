package com.absurd.fireboom.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by wangwenwei on 2017/10/16.
 */
@ApiModel
@Data
public class HelloParams {
    @ApiModelProperty(value = "等级",example = "a,v,c")
    private String[] levels;

    private String name;

}
