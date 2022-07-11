package com.labs.alticci.api.controller;

import com.labs.alticci.api.model.Response;
import com.labs.alticci.api.openApi.controller.SequenceControllerOpenApi;
import com.labs.alticci.domain.service.SequenceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/alticci")
@AllArgsConstructor
public class SequenceController implements SequenceControllerOpenApi {

    private SequenceService service;

    @GetMapping("/{index}")
    @ResponseStatus(HttpStatus.OK)
    public Response getSequenceValue(@PathVariable @Valid Integer index) {
        return service.getSequenceValue(index);
    }
}
