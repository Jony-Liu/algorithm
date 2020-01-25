package com.example.algorithm.multithread.chapter02.t9;

/**
 * @author jonyliu
 * @date 2020/1/20 16:57
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            //使用 list 作为对象锁，可邮箱防止"脏读"的出现
            synchronized (list){
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
