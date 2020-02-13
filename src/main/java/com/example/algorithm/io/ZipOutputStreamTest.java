package com.example.algorithm.io;

import org.apache.tools.zip.ZipOutputStream;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Jony-Liu
 */
public class ZipOutputStreamTest {

    @Test
    public void test() throws Exception {
        File file = new File("c:\\temp\\中文");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("c:\\temp\\2019.zip"));
        out.setEncoding("GBK");
        out.putNextEntry(new org.apache.tools.zip.ZipEntry("中文"));
        FileInputStream in = new FileInputStream(file);
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        System.out.println("zip done");
        in.close();
        out.close();
    }

}
