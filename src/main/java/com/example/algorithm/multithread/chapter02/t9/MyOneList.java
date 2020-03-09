package com.example.algorithm.multithread.chapter02.t9;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2020/1/20 16:55
 */
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void  add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
