package com.example.algorithm.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jony-Liu
 */
public class IteratorTest {

    @Test
    public void test01(){
        List<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("1");
        arrayList1.add("2");
        for (String s : arrayList1) {
            if("1".equals(s)){
                arrayList1.remove(s);
            }
        }
        //throw a ConcurrentModificationException
        List<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("2");
        arrayList2.add("1");
        for (String s : arrayList2) {
            if("1".equals(s)){
                arrayList2.remove(s);
            }
        }
    }

    @Test
    public void test02(){
        List<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("2");
        arrayList2.add("1");
        Iterator<String> iterator = arrayList2.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            if("1".equals(item)){
                iterator.remove();
            }
        }
    }
}
