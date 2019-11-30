package com.example.algorithm.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jony-Liu
 */
public class ReaderDemo {

    public static void main(String[] args) {
        try {
            FileReader f= new FileReader("D:"+File.separator+"file"+File.separator+"a.txt");
            char[] c = new char[1024];
            int length;
            while((length=f.read(c))!=-1){
                System.out.println(new String(c,0,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}