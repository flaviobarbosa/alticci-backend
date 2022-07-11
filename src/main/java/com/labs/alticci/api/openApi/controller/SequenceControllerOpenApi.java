package com.labs.alticci.api.openApi.controller;

import com.labs.alticci.api.model.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

@Api(tags = "Sequence")
public interface SequenceControllerOpenApi {

    @ApiOperation("Returns the sequence value for the index")
    Response getSequenceValue(@ApiParam(value = "Sequence index", example = "1", required = true) Integer index);
}
