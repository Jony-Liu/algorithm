package com.example.algorithm.lock;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private String accountNo;
    private int balance;
    Lock lock = new ReentrantLock();
    Condition  con = lock.newCondition();
    boolean flag = false;//账户还没有打钱

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, int balance) {
        super();
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void draw(int money){//取钱
        lock.lock();
        try {
            if(!flag){
                con.await();
            }else{
                balance -=money;
                System.out.println(Thread.currentThread().getName()+"取钱成功,账户余额："+balance);
                flag =false;
                con.signalAll();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    public void deposit(int money){//存钱
        lock.lock();
        try {
            if(flag){
                con.await();
            }else{
                balance +=money;
                System.out.println(Thread.currentThread().getName()+"存钱成功,账户余额："+balance);
                flag = true;
                con.signalAll();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
		/*public int hashCode()
		{
			return accountNo.hashCode();
		}
		public boolean equals(Object obj)
		{
			if(this == obj)
				return true;
			if (obj !=null
				&& obj.getClass() == Account.class)
			{
				Account target = (Account)obj;
				return target.getAccountNo().equals(accountNo);
			}
			return false;
		}*/

}
