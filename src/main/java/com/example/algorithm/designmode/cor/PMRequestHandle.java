package com.example.algorithm.designmode.cor;

/**
 * @author Jony-Liu
 * @date 2019/9/11 20:42
 */
public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;

    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("要加薪, 项目经理审批!");
        } else {
            rh.handleRequest(request);
        }
    }
}

