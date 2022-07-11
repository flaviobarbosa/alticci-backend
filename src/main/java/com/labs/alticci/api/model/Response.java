package com.labs.alticci.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class Response {

    @ApiModelProperty(example = "1")
    private Long data;

}
