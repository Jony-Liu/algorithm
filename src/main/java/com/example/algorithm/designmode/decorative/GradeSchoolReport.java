package com.example.algorithm.designmode.decorative;

/**
 * @author Jony-Liu
 */
public class GradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        // TODO Auto-generated method stub
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        // TODO Auto-generated method stub
        System.out.println("家长签名为： "+name);
    }

}
