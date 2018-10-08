package com.practice.test.operations;

import java.util.List;

public class OperationFactory {
    public static IOperation createOperation(String type) {
        switch (type) {
            case "Add" :
                return new AddOperation();

        }

        return null;
    }
}
