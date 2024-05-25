package com.zm.stream;

import java.io.*;

public class outputIO {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        OutputStream outputStream = null;
        try {
             outputStream = new FileOutputStream(file);
            try {
                outputStream.write(99);
                outputStream.write("yanzhiming".getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
