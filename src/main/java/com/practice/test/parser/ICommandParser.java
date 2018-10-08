package com.practice.test.parser;

import com.practice.test.operations.IOperation;

public interface ICommandParser{
    IOperation parseCommand(String command);


}
