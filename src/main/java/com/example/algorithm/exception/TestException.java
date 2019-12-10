package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 */
public class TestException {
    public  int add(){
        int a=1;
        int b=2;
        try{

            return a+b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("必须执行的代码");
            a++;
        }
        return 5;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestException e =new  TestException();

        System.out.println(e.add());
    }
}