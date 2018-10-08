package com.practice.test.operations;

import java.util.List;

public class SubtractOperation implements IOperation{

    private List<Integer> operandList;
    @Override
    public void SetOperands(List<Integer> operandList) {
        this.operandList = operandList;
    }

    @Override
    public Integer process(Integer value) {
        return value - operandList.get(0);
    }
}
