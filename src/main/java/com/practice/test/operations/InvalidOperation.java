package com.practice.test.operations;

import java.util.List;

public class InvalidOperation implements IOperation {
    @Override
    public void SetOperands(List<Integer> operandList) {

    }

    @Override
    public Integer process(Integer value) {
        return value;
    }
}
