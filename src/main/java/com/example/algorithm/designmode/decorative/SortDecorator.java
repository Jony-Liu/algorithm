package com.example.algorithm.designmode.decorative;

/**
 * @author Jony-Liu
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
        // TODO Auto-generated constructor stub
    }
    public void reportSort(){
        System.out.println("我是排名第38名...");
    }
    @Override
    public void report() {
        // TODO Auto-generated method stub
        super.report();
        this.reportSort();
    }

}
