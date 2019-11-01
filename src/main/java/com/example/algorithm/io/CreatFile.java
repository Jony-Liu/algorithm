package com.example.algorithm.io;


import java.io.File;
import java.io.IOException;

public class CreatFile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f = new File("D:\\file\\demo.txt");
        System.out.println(f);
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        try {
            f.createNewFile();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println("f.exists:" + f.exists());
        //分隔符错误
		/*File f1 = new File("file\1.txt");
		try {
			f1.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		/*System.out.println(f1.getAbsolutePath());
		System.out.println("f1.exists():"+f1.exists());*/
        System.out.println(f.length());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        File f3 = new File("D:\\c.txt");
        try {
            f3.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(f3.exists());
        //f3.delete();
        f3.deleteOnExit();//在退出后删除
        System.out.println(f3.exists());
        System.out.println("----------------------");
        File f4 = new File("D:\\file");
        //f4.mkdir();//创建单级文件夹
        f4.mkdirs();//创建多级文件夹；
        System.out.println(f4.exists());
        File f5 = new File(f4, "f5.txt");
        try {
            f5.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(f5.exists());

    }

}