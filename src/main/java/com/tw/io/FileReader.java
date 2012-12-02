package com.tw.io;

import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/twer/work/yexiao/.gitignore");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while((line = bufferedReader.readLine()) != null)
            System.out.println(line);
    }
}
