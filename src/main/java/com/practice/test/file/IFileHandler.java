package com.practice.test.file;

import java.io.IOException;

public interface IFileHandler {
    void writeValueToFile(int val) throws IOException;
    int readValueFromFile() throws IOException;
}
