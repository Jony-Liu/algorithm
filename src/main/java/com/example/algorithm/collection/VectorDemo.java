package com.example.algorithm.collection;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vector vector = new Vector();
        vector.addElement("a");
        vector.addElement("b");
        vector.addElement("c");
        vector.addElement("d");
        vector.addElement(null);
        System.out.println("--------------------");
        for(int i=0;i<vector.size();i++){
            System.out.println(vector.elementAt(i));
        }
        System.out.println("--------------------");
        System.out.println(vector.elementAt(0));
        System.out.println("--------------------");
        vector.remove(1);
        for(Object o:vector){
            System.out.println(o);
        }
        System.out.println("--------------------");
        vector.add(1, "b");
        Iterator i = vector.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}