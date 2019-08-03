package com.example.algorithm.thread;

class Ticket implements Runnable {
    private int tick = 20;
    Object o = new Object();

    public synchronized boolean ticket() {
        if (tick > 0) {
            System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
            return true;
        } else {
            return false;
        }
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (!ticket()) {
                break;
            }
        }
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("t1窗口");
        t2.setName("t2窗口");
        t3.setName("t3窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
