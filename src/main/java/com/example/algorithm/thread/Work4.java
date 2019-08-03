package com.example.algorithm.thread;


/*
 * 利用多线程求解某范围素数,每个线程负责 1000范围：线程1找1-1000；线
程 2 找 1001-2000；线程 3 找 2001-3000。编程程序将每个线程找到的素数及时
打印。
 *
 */
class PrimeNum extends Thread {

    int x;// 最大
    int n;// 最小
    Object o;
    public PrimeNum(String name, int n, int x) {
        // TODO Auto-generated constructor stub
        super(name);
        this.n = n;
        this.x = x;
    }

/*	public synchronized void judge(int n) {//设置同步方法，对单个整数进行判断
		int i = 1;
		while (++i < n) {
			if (n % i == 0) {
				break;
			}
		}
		if (n == i)
			System.out.println(Thread.currentThread().getName() + "找到的素数：" + n);
	}*/

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (++n < x) {	//对n到x的整数循环遍历进行判断
            //	judge(n);
            //设置同步方法，对单个整数进行判断
            int i = 1;
            while (++i < n) {
                if (n % i == 0) {
                    break;
                }
            }
            if (n == i)
                System.out.println(Thread.currentThread().getName() + "找到的素数：" + n);


        }
    }
}

public class Work4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrimeNum p1 = new PrimeNum("线程1", 1, 1000);
        PrimeNum p2 = new PrimeNum("线程2", 1001, 2000);
        PrimeNum p3 = new PrimeNum("线程3", 2001, 3000);
        p1.start();
        p2.start();
        p3.start();
    }

}
