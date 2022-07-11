package com.labs.alticci.domain.service.impl;

import com.labs.alticci.api.model.Response;
import com.labs.alticci.domain.service.SequenceService;
import org.springframework.stereotype.Service;

import java.util.TreeMap;

@Service
public class SequenceServiceImpl implements SequenceService {

    private static TreeMap<Integer, Long> cache = new TreeMap<>();

    public SequenceServiceImpl() {
        cache.put(0, 0L);
        cache.put(1, 1L);
        cache.put(2, 1L);
    }

    @Override
    public Response getSequenceValue(Integer index) {
        Long sequenceValue = cache.containsKey(index) ? cache.get(index) : calculate(index);

        cache.putIfAbsent(index, sequenceValue);

        return Response.builder().data(sequenceValue).build();
    }

    private Long calculate(Integer index) {
        if(cache.containsKey(index))
            return cache.get(index);

        Long calculateMinus3 = calculate(index - 3);
        cache.putIfAbsent(index - 3, calculateMinus3);

        Long calculateMinus2 = calculate(index - 2);
        cache.putIfAbsent(index - 2, calculateMinus2);

        return calculateMinus3 + calculateMinus2;
    }
}
