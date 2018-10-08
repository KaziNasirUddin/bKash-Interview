package com.practice.test.operations;

import java.util.List;

public class QuitOperation implements IOperation{

    @Override
    public void SetOperands(List<Integer> operandList) {

    }

    @Override
    public Integer process(Integer value) {
        System.exit(0);
        return 0;
    }
}
