package com.labs.alticci.domain.service.impl;

import com.labs.alticci.api.model.Response;
import com.labs.alticci.domain.service.SequenceService;
import org.springframework.stereotype.Service;

@Service
public class SequenceServiceImpl implements SequenceService {

    @Override
    public Response getSequenceValue(Integer index) {
        Long sequenceValue = calculate(index);

        return Response.builder().data(sequenceValue).build();
    }

    private Long calculate(Integer index) {
        if(index == 0)
            return 0L;

        if(index == 1 || index == 2)
            return 1L;

        return calculate(index - 3) + calculate(index - 2);
    }
}
