package com.example.algorithm.multithread.chapter02.synBlockString;

/**
 * @author jonyliu
 * @date 2020/1/20 17:27
 */
public class Service {
    private String userNameParam;
    private String passWordParam;
//    private String anyString = new String();

    public void setUserNamePassWord(String userName,String passWord){
        try{
            //使用 anyString 作为对象锁
            String anyString = new String();
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步块");
                this.userNameParam = userName;
                Thread.sleep(3000);
                this.passWordParam = passWord;
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
