package com.example.algorithm.collection;


import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String, String> hm = new HashMap<>();//Java 7 以后推荐使用这种菱形语法，系统会推断尖括号中的数据类型
        hm.put("1", "钢铁侠");
        hm.put("2", "闪电侠");
        hm.put("3", "雷神");
        hm.put("4", "美国队长");
        System.out.println("----------/遍历方式一-----------");
        Set set = hm.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) { //遍历方式一
            Object key = it.next();
            Object value = hm.get(key);
            System.out.println(key + " " + value);
        }
        hm.put("4", "黑寡妇");
        System.out.println("----------/遍历方式二-----------");
        Collection c = hm.entrySet();//遍历方式二
        Iterator it1 = c.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("----------遍历方式三-----------");
        hm.remove("3");
        Collection c1 = hm.entrySet();//遍历方式三
        Iterator it2 = c1.iterator();
        while (it2.hasNext()) {
            Map.Entry me = (Map.Entry) it2.next();
            System.out.println(me.getKey() + "=" + me.getValue());
        }
        System.out.println("----------遍历方式四-----------");
        Collection c2 = hm.values(); //遍历方式四
        Iterator it3 = c2.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        System.out.println("---------遍历方式五------------");
        Collection c3 = hm.values();//遍历方式五
        for (Object ob1 : c3) {
            System.out.println(ob1);
        }
        System.out.println("----------遍历方式六-----------");
        for (Map.Entry<String, String> object : hm.entrySet()) {
            System.out.println(object.getKey() + "=" + object.getValue());
        }
        System.out.println("---------------------");
        System.out.println("复仇者联盟2号成员：" + hm.get("2"));
        System.out.println("---------------------");
        System.out.println(hm.containsKey("1"));
    }
}
