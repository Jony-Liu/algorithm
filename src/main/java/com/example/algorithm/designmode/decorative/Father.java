package com.example.algorithm.designmode.decorative;


public class Father {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("爸爸");
    }

}