package com.practice.test.operations;

import java.util.List;

public interface IOperation {
    void SetOperands(List<Integer> operandList);
    Integer process(Integer value);

}
