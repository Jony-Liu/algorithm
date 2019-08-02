package com.example.algorithm.io;

import java.io.*;

public class CopeReadWrite {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            FileReader f = new FileReader("D:" + File.separator + "file" + File.separator + "a.txt");
            FileWriter f1 = new FileWriter("D:" + File.separator + "file" + File.separator + "c.txt");
            char[] buffer = new char[1024];
            int length;
            while ((length = f.read(buffer)) != -1) {
                f1.write(buffer, 0, length);
            }
            f.close();
            f1.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

}
