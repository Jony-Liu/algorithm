package com.example.algorithm.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jony-Liu
 */
public class Editor {

    /**
     * write string into File
     * @param newStr
     * @param path
     * @throws IOException
     */
    public void writeTxtFile(StringBuffer newStr, String path)
            throws IOException {
        //
        FileWriter tempFileWriter = null;
        PrintWriter tempPrintWriter = null;
        try {
            tempFileWriter = new FileWriter(path, true);
            tempPrintWriter = new PrintWriter(tempFileWriter);
            tempPrintWriter.print(newStr);
            tempPrintWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("输出TXT文件异常，请检查：");
        } finally {
            tempPrintWriter.close();
            tempFileWriter.close();
        }
    }

}
