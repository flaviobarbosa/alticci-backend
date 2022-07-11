package com.labs.alticci.domain.service;

import com.labs.alticci.api.model.Response;

public interface SequenceService {
    Response getSequenceValue(Integer index);
}
