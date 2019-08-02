package com.example.algorithm.genericity;


import java.util.ArrayList;
import java.util.List;

public class BaseDao<T> {
    private ArrayList<T> list = new ArrayList<>();
    public List<T> getData(){
        return this.list;
    }
    public void addAll(List<? extends T> data){
        list.addAll(data);
    }
    public void add(T o){
        list.add(o);
    }
    public<E> int compareSize(List<E> parm){
        for(E e: parm){
            System.out.println(e);
        }
        return list.size()-parm.size();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BaseDao<Person> bd = new BaseDao<>();
        bd.add(new Person("liu",18));
        List<Boy> boy = new ArrayList<>();
        boy.add(new Boy("zhang",20));
        bd.addAll(boy);
        System.out.println(bd.compareSize(boy));
    }

}
