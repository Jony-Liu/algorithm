package com.example.algorithm.designmode.singleton;


public class Singleton {
    //饿汉式
	/*private static Singleton onlyone=new Singleton();
	private Singleton(){

	}
	public static  Singleton getSingle(){
		return  onlyone;
	}*/
    //懒汉式，这种写法存在线程安全隐患
    private static Singleton onlyone =null;//定义一个静态成员变量；
    private Singleton(){//只能在类内常见对象

    }
    public static Singleton getSingle(){//用于在类外返回唯一的对象
        if(onlyone==null){
            onlyone= new Singleton();
        }
        return onlyone;
    }
}
