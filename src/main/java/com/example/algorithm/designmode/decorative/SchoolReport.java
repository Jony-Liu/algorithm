package com.example.algorithm.designmode.decorative;

/**
 * @author Jony-Liu
 */
public abstract class SchoolReport {
    /**
     * 打印成绩单
     */
    public abstract void report();

    /**
     * 家长签名
     * @param name
     */
    public abstract void sign(String name);
}