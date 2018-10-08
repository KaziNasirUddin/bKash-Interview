package com.practice.test.file;

import java.io.*;

public class FileHandler implements IFileHandler{

    private String filePath;

    public FileHandler(String filePath) throws IOException {
        this.filePath = filePath;
        File f = new File(filePath);
        boolean notExists = f.createNewFile();
        if(notExists)
        {
            writeValueToFile(0);
        }
    }

    @Override
    public void writeValueToFile(int val) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath));
        dos.writeInt(val);
    }

    @Override
    public int readValueFromFile() throws IOException {
        if (!new File(filePath).canRead()) throw new IOException("Cannot read file");
        DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
            return dis.readInt();
    }
}
