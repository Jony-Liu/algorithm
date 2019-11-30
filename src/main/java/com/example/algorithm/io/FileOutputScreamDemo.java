package com.example.algorithm.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Jony-Liu
 */
public class FileOutputScreamDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            FileOutputStream f = new FileOutputStream("D:" + File.separator + "file" + File.separator + "a.txt", true);
            String s = "hello,world!\r\n";
            byte[] t = s.getBytes();
            f.write(t);
            f.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
