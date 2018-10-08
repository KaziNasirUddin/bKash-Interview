package com.practice.test.operations;


public class OperationFactory {
    public static IOperation createOperation(String type) {
        switch (type) {
            case "add" :
                return new AddOperation();
            case "sub" :
                return new SubtractOperation();
            case "show":
                return new ShowOperation();
            case "clear" :
                return new ClearOperation();
            case "exit" :
                return new QuitOperation();
            default :
                return new InvalidOperation();
        }

    }
}
