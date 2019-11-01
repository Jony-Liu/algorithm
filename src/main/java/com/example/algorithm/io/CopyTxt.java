package com.example.algorithm.io;

import org.junit.Test;

import java.io.*;

public class CopyTxt {

    /**
     * way 1
     * used time:29
     */
    @Test
    public void test01() {
        try {
            FileInputStream f = new FileInputStream("D:" + File.separator + "file" + File.separator + "SurfaceLaptop2.jpg");
            FileOutputStream f1 = new FileOutputStream("D:" + File.separator + "file" + File.separator + "b.jpg");
            try {
                long start = System.currentTimeMillis();
                byte[] b = new byte[1024];
                while ((f.read(b)) != -1) {
                    f1.write(b);
                }
                System.out.println("used time:" + (System.currentTimeMillis() - start));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (f != null) {
                        f.close();
                    }
                    if (f1 != null) {
                        f1.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * way 2
     * used time:8
     */
    @Test
    public void test02() {
        try {
            FileInputStream f = new FileInputStream("D:" + File.separator + "file" + File.separator + "SurfaceLaptop2.jpg");
            FileOutputStream f2 = new FileOutputStream("D:" + File.separator + "file" + File.separator + "c.jpg");
            BufferedOutputStream out = new BufferedOutputStream(f2);
            BufferedInputStream in = new BufferedInputStream(f);
            try {
                long start1 = System.currentTimeMillis();
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                byte[] bytes = new byte[1024];
                while (in.read(bytes) != -1) {
                    out.write(bytes);
                }
                System.out.println("used time:" + (System.currentTimeMillis() - start1));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

