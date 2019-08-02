package com.example.algorithm.io;

import java.io.File;

public class MkdirDemo {

    public static void deleteFile(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                deleteFile(f);
            }
        }
        file.delete();
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub
        File f = new File("file");
        f.mkdir();
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        //System.out.println(f.delete());
        System.out.println(f.listFiles());
        deleteFile(f);
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.listFiles());
    }

}
