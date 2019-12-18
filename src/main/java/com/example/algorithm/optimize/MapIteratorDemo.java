package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author jonyliu
 * @date 2019/12/16 9:44
 */
public class MapIteratorDemo {

    @Test
    public void test() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("111", "222");
        hm.put("333", "444");
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        ///////// 遍历Map的key值
        Set keySet = hm.keySet();
        for (Object o:keySet
                ) {
            System.out.println(o);
        }
    }
}
