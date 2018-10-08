package com.practice.test.parser;

import com.practice.test.operations.IOperation;
import com.practice.test.operations.OperationFactory;

import java.util.ArrayList;
import java.util.List;

public class CommandParser implements ICommandParser{

    @Override
    public IOperation parseCommand(String command) {
        String[] splited = command.split(" ");
        String commandName = splited[0];
        List<Integer> operandList = new ArrayList<>();
        for(int i = 1; i < splited.length; i++)
        {
            operandList.add(Integer.parseInt(splited[i]));
        }

        IOperation operation = OperationFactory.createOperation(commandName);
        operation.SetOperands(operandList);
        return operation;

    }


}
