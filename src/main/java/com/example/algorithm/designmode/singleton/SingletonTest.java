package com.example.algorithm.designmode.singleton;

/**
 * @author Jony-Liu
 */
public class SingletonTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Singleton single1 = Singleton.getSingle();
        Singleton single2 = Singleton.getSingle();
        if(single1==single2){
            System.out.println("same");
        }
    }

}
