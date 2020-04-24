package com.example.algorithm.thread;


/**
 *     创建一个线程类，用此线程类创建4个线程，4个线程分别打印,保证1234依次执行
 *     线程名字  1
 *     线程名字  2
 *     线程名字  3
 *     线程名字  4
 * @author Jony-Liu
 */
class Print extends Thread{
    private static int num=1;
    private Thread  t;
    // static Object o;
    public Print(String name,Thread t) {
        // TODO Auto-generated constructor stub
        super(name);
        this.t = t;

    }

    @Override
    public  void run() {
        if(t!=null){
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // TODO Auto-generated catch block
        System.out.println(Thread.currentThread().getName()+"\t"+num);
        if(num==4){
            num=1;
        }else{
            num=num+1;
        }
    }

}

/**
 * @author Jony-Liu
 */
public class Work6 {
    public static void main(String[] args) {
        Print p1 = new Print("Thread-0",null);
        Print p2 = new Print("Thread-1",p1);
        Print p3 = new Print("Thread-2",p2);
        Print p4 = new Print("Thread-3",p3);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}

