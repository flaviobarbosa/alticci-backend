package com.labs.alticci.api.openApi.controller;

import com.labs.alticci.api.exceptionhandler.ExceptionDTO;
import com.labs.alticci.api.model.Response;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

@Api(tags = "Sequence")
public interface SequenceControllerOpenApi {

    @ApiOperation("Returns the sequence value for the index")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Sequence value successfully returned"),
            @ApiResponse(code = 400, message = "Invalid index", response = ExceptionDTO.class)
    })
    Response getSequenceValue(@ApiParam(value = "Sequence index", example = "1", required = true) Integer index);
}
