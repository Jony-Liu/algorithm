package com.example.algorithm.thread;

/**
 * @author Jony-Liu
 */
class JoinDemo implements Runnable{

    private Thread thread;

    public JoinDemo() {
        // TODO Auto-generated constructor stub
    }

    public JoinDemo(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        if(thread != null){
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}

/**
 * @author Jony-Liu
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JoinDemo j1= new JoinDemo();
        Thread t1 = new Thread(j1,"thread1");
        t1.start();
        JoinDemo j2 = new JoinDemo(t1);
        Thread t2 = new Thread(j2,"thread2");
        t2.start();
    }

}
