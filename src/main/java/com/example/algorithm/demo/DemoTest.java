package com.example.algorithm.demo;

import com.example.algorithm.reflect.Person;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author Jony-Liu
 */
public class DemoTest {

    @Test
    public void test28(){
        int[][] arr={{1,2,3},{4,5,6,7},{9}};
        boolean found = false;
        for(int i=0;i<arr.length&&!found;i++)       {
            for(int j=0;j<arr[i].length;j++){
                System.out.println("i=" + i + ",j=" + j);
                if(arr[i][j] ==5) {
                    found =true;
                    break;
                }
            }
        }
    }

    @Test
    public void test27(){
        ok:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.println("i=" + i + ",j=" + j);
                if(j == 5){
                    break ok;
                }
            }
        }
    }


    @Test
    public void test26(){
        List<String> list = new ArrayList<>();
        list.add("he");
        list.add("she");
        System.out.println(list.get(2));
    }

    @Test
    public void test25(){
        System.out.println(Math.round(-11.6));
    }

    @Test
    public void test24(){
        Integer integer = Integer.MAX_VALUE;
        System.out.println(integer);
        System.out.println(integer+1);
    }

    @Test
    public void test23() {
        String[] strings = {"hello","world","kitty"};
        List<String> list = new ArrayList(Arrays.asList(strings));
        list.add("bb");
        System.out.println(list.toString());
    }

    @Test
    public void test22(){
        int i = 223;
        int ii = 223;
        System.out.println(i == ii);
    }

    @Test
    public void test21(){
        System.out.println(Math.round(-2.5));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.6));
        System.out.println(Math.round(2.6));
    }

    @Test
    public void test20() {
        Map map = new HashMap(2);
        Map p = Collections.synchronizedMap(map);
        Thread.interrupted();
    }

    @Test
    public void test19() {
        char[] chars = "hello".toCharArray();
        Set<Character> set = new HashSet();
        for (char c : chars) {
            if(!set.add(c)){
                System.out.println(c);
            }
        }
    }

    @Test
    public void test18() {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer == 2) {
                list.remove(integer);
            }
        }
    }

    @Test
    public void test17() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("world");
        }
    }

    @Test
    public void test16() {
        String string = null;
        Object object = string;
        Long l = (Long) object;
        System.out.println(l);
        System.out.println("------------");
        String string01 = " ";
        //error java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Long
        Object object01 = string01;
        Long l01 = (Long) object01;
        System.err.println(l01);

        System.out.println("jj");

    }

    @Test
    public void test15() {
        Properties properties = new Properties();
        String file = "com/example/algorithm/jdbc/database.properties";
        //从类的根目录中读取文件
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(file);
        try {
            properties.load(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(properties.get("url"));

        System.out.println(this.getClass().getClassLoader().getResource(file).getPath());
    }

    @Test
    public void test14() {
        int[] ints = {1, 2, 3, 4, 5};
        int[] ints1 = new int[5];
        System.arraycopy(ints, 1, ints1, 0, 2);
        System.out.println(Arrays.toString(ints1));
    }

    @Test
    public void test13() {
        String a = "abcd";
        String b = "abcd";
        // True
        System.out.println(a == b);
        // True
        System.out.println(a.equals(b));
        String c = new String("abcd");
        String d = new String("abcd");
        // False
        System.out.println(c == d);
        // True
        System.out.println(c.equals(d));
        String e = new String("abcd").intern();
        String f = new String("abcd").intern();
        // Now true
        System.out.println(e == f);
        System.out.println(e.equals(f));
    }

    @Test
    public void test12() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            if (s.equals("a")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test11() {
        String[] arr = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set.contains("a"));
        System.out.println("----------------");
        System.out.println(Arrays.asList(arr).contains("a"));
    }

    @Test
    public void test10() {
        String[] strings = {"a", "b", "c"};
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
        //list.add("d");//RunTime Exception ---> UnsupportedOperationException
        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("d");
        System.out.println(arrayList);
    }

    @Test
    public void test09() {
        System.out.println(Person.class.getName());
    }

    @Test
    public void test08() {
        String.valueOf(null);
        Exception e = new Exception("myException");
        System.out.println(e.getMessage());
        e.printStackTrace();

    }

    @Test
    public void test07() {
        String str = "hfname.jpg";
        System.out.println(str.lastIndexOf("."));
        System.out.println(str.substring(5));
        do {

        } while (true);
    }

    @Test
    public void test06() {
        Collection c = Collections.synchronizedCollection(new ArrayList<>());
        c.add("hello");
        System.out.println(c);
        Map<String, String> map = new Hashtable<>();
    }

    @Test
    public void test05() {
        Queue<String> queue = new PriorityQueue();
        queue.add("hello");
        System.out.println(queue.toString());
        Deque<String> deque = new ArrayDeque();
        deque.push("hello");
        System.out.println(deque);
    }

    @Test
    public void test04() {
        Integer i = new Integer(1);
        Integer ii = new Integer(1);
        System.out.println(i == ii);
        System.out.println(i.equals(ii));
    }

    @Test
    public void test03() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", null);
        System.out.println(map.toString());
        System.out.println("-----------");
        Map<String, String> map1 = new Hashtable<>();
        //NullPointerException
        map1.put("kitty", null);
        System.out.println(map1);
    }

    @Test
    public void test02() {
        String s1 = "kitty";
        String s2 = "kitty";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String string = new String("hello");
        String string1 = new String("hello");
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string == string1);
        System.out.println(string.hashCode());
        System.out.println(string1.hashCode());
        System.out.println(string.equals(string1));
    }


    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(2);
        System.out.println(list);
        Set<Integer> set = new HashSet(list);
        System.out.println(set);
        Object[] objects = list.toArray();
        Arrays.sort(objects);
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    @Test
    public void test() {
        Person person = new Person();
        Person person1 = new Person();
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person.equals(person1));
    }

}
