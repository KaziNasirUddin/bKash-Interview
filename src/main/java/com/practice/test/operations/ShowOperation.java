package com.practice.test.operations;

import java.util.List;

public class ShowOperation implements IOperation{
    @Override
    public void SetOperands(List<Integer> operandList) {

    }

    @Override
    public Integer process(Integer value) {
        return value;
    }
}
