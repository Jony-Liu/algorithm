package com.example.algorithm.collection;

import java.util.*;

/**
 * @author Jony-Liu
 */
public class Test2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashMap hm = new LinkedHashMap();
        hm.put("张三", 90);
        hm.put("王二", 95);
        hm.put("李四", 75);
        hm.put("小明", 88);
        hm.put("小红", 90);
		/*LinkedList ll = new LinkedList();
		Set set=hm.entrySet();
		Iterator iterator= set.iterator();*/
        for (int i = 0; i < 3; i++) {
            Set set = hm.entrySet();
            Iterator iterator = set.iterator();
            Collection c = hm.values();
            Integer i1 = (Integer) Collections.max(c);
            while (iterator.hasNext()) {
                Map.Entry me = (Map.Entry) iterator.next();
                Object ob = me.getKey();
                if (me.getValue().equals(i1)) {
                    System.out.println("第" + (i + 1) + "名：" + me.getKey() + "  分数：" + me.getValue());
                    hm.remove(me.getKey());
                    break;
                }
            }
        }
    }
}
