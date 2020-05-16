package com.example.algorithm.designmode.singleton;

/**
 * @author Jony-Liu
 */
public class Singleton {
    //Eager Singleton
	/*private static Singleton onlyone=new Singleton();
	private Singleton(){

	}
	public static  Singleton getSingle(){
		return  onlyone;
	}*/
    //Lazy Singleton,exist thread security
    private static Singleton onlyone =null;
    private Singleton(){

    }
    public static Singleton getSingle(){
        if(onlyone==null){
            onlyone= new Singleton();
        }
        return onlyone;
    }
}
