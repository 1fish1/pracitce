package com.zm.stream;

import java.io.*;

public class InputOutStreamDemo {
    public static void main(String[] args) {


        File  file = new File("aaa.txt");

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
          String str= String.valueOf(inputStream.read());

            System.out.println("str="+str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
