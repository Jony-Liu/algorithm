package com.example.algorithm.designmode.cor;

/**
 * @author Jony-Liu
 * @date 2019/9/11 20:41
 */
public class HRRequestHandle implements RequestHandle {

    @Override
    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println("要离职, 人事审批!");
        }
    }
}

