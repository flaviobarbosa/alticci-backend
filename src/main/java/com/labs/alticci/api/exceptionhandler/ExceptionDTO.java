package com.labs.alticci.api.exceptionhandler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ExceptionDTO {

    @ApiModelProperty(example = "400")
    private int code;

    @ApiModelProperty(example = "Invalid index")
    private String message;

}
