package com.labs.alticci.api.controller;

import com.labs.alticci.api.model.Response;
import com.labs.alticci.domain.service.SequenceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/alticci")
@AllArgsConstructor
public class SequenceController {

    private SequenceService service;

    @GetMapping("/{index}")
    public Response getSequenceValue(@PathVariable @Valid Integer index) {
        return service.getSequenceValue(index);
    }
}
