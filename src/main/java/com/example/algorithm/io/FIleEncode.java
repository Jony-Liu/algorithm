package com.example.algorithm.io;

import java.io.*;

/**
 * @author Jony-Liu
 * @date 2019/10/25 21:08
 */
public class FIleEncode {

    public static void main(String[] args) {
        //根目录
        String rootPath = "D:\\myworkspace\\eftcvt\\src";
        //rootPath = "D:\\myworkspace\\eftcvt\\src\\main\\java\\com\\aegon_cnooc\\eftcvt\\bankManager";
        //文件后缀名 .java .xml .dtd .properties .js .css .jsp
        // {".java", ".xml", ".dtd", ".properties", ".js", ".css", ".jsp"};
        String[] suffixes = {".java"};
        for (String suffix : suffixes) {
            findFile(rootPath, suffix);
        }
    }

    /**
     * 递归查询
     *
     * @param path 根目录
     */
    public static void findFile(String path, String suffix) {
        File rootFile = new File(path);
        if (rootFile.isDirectory()) {
            File[] files = rootFile.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    findFile(f.getAbsolutePath(), suffix);
                } else {
                    //处理java文件
                    if (f.getAbsolutePath().endsWith(suffix)) {
                        System.out.println("绝对地址" + f.getAbsolutePath());
                        try {
                            changeEncode(f.getAbsolutePath());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            return;
        }
    }

    /**
     * @param path
     * @throws IOException
     */
    public static void changeEncode(String path) throws Exception {
        String newPath = path + ".bak";

        FileReader i = new FileReader(path);
        System.out.println(i.getEncoding());
        if (!"GBK".equals(i.getEncoding())) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), i.getEncoding()));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(newPath), "UTF-8"));
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (i != null) {
                    i.close();
                }
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
        //修改文件名
        changeName(path, newPath);
    }

    /**
     * @param path
     * @param newPath
     */
    public static void changeName(String path, String newPath) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("已刪除备份");
        } else {
            System.err.println("删除失败");
        }
        File file1 = new File(newPath);
        file1.renameTo(new File(path));
    }

}

