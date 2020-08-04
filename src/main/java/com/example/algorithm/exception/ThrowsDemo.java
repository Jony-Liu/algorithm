package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 */
public class ThrowsDemo {

    public void div() throws RuntimeException{
        int a= 1;
        int b= 0;
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            ThrowsDemo demo = new ThrowsDemo();
            demo.div();
        }catch(RuntimeException e){
            System.out.println("Exception");
            e.printStackTrace();
        }

    }

}
