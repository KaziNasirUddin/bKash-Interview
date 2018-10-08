package com.practice.test.parser;

import com.practice.test.operations.IOperation;
import com.practice.test.operations.OperationFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CommandParser implements ICommandParser{

    @Override
    public IOperation parseCommand(String commandString) throws Exception {
        String[] commandComponents = getCommandComponents(commandString);

        String commandName = commandComponents[0];
        IOperation operation = OperationFactory.createOperation(commandName);

        List<Integer> operandList = new ArrayList<>();
        Stream.of(commandComponents).skip(1).forEach((x) ->{
            operandList.add(Integer.parseInt(x));
        });
        operation.SetOperands(operandList);

        return operation;

    }

    private String[] getCommandComponents(String commandString) throws Exception {
        String[] result = commandString.split(" ");
        if(result.length < 0) {
            throw new Exception("Invalid Command String");
        }
        return result;
    }




}
