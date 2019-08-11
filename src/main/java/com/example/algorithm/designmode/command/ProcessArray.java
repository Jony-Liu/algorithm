package com.example.algorithm.designmode.command;

public class ProcessArray {
    public void process(int[] target, Command cmd) {
        cmd.process(target);
    }
}
