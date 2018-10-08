package com.practice.test;

import com.practice.test.file.FileHandler;
import com.practice.test.file.IFileHandler;
import com.practice.test.operations.IOperation;
import com.practice.test.operations.InvalidOperation;
import com.practice.test.parser.CommandParser;
import com.practice.test.parser.ICommandParser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length == 0)
        {
            System.out.println("Required filename is missing");
            return;
        }
        String fileName = args[0];

        IFileHandler fileHandler = new FileHandler(args[0]);
        ICommandParser commandParser = new CommandParser();
        int value = 0;
        while(true) {
            Scanner scanner = new Scanner(System. in);
            String input = scanner. nextLine();
            IOperation operation = commandParser.parseCommand(input);
            if(operation instanceof InvalidOperation){
                System.out.println("Invalid Command");
            } else{
                value = fileHandler.readValueFromFile();
                value = operation.process(value);
                System.out.println(value);
                fileHandler.writeValueToFile(value);
            }

        }



    }
}
