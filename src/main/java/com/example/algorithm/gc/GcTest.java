package com.example.algorithm.gc;

/**
 * check the jvm:
 * jps
 * jmap -dump:format=b,file=heap.bin <pid>
 * jhat -J-Xmx512m heap.bin
 * http://localhost:7000
 */
public class GcTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 0; i < 4; i++) {
            BigObject bigObject = new BigObject();
            System.out.println(bigObject.toString());
            //System.gc();
            Runtime.getRuntime().gc();
        }
    }

    public void finalize() {
        System.out.println("clean the resource of GcTest");
    }
}
