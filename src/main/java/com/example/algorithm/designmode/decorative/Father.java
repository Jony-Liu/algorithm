package com.example.algorithm.designmode.decorative;

/**
 * @author Jony-Liu
 */
public class Father {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SchoolReport sr;
        sr = new GradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("爸爸");
    }

}