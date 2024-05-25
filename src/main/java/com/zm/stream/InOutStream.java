package com.zm.stream;

import java.io.*;

public class InOutStream {
    public static void main(String[] args) {

        System.out.println("shell ");

        File Infile = new File("aaa.txt");
        File Outfile = new File("abc.txt");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(Infile);
            outputStream = new FileOutputStream(Outfile);
            byte [] b =new byte [(int)Infile.length()];
            inputStream.read(b);
            System.out.println("内容为:" + new String(b));

            outputStream.write(b);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
