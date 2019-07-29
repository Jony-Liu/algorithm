package com.example.algorithm.gc;

public class BigObject {

    private byte[] bytes;

    public BigObject() {
        bytes = new byte[128];
        for (int i =0;i<128;i++ ){
            bytes[i]=(byte)i;
        }
    }

    public String toString(){
        return String.valueOf(bytes.length);
    }

    public void finalize(){
        System.err.println("clean the BigObject");
    }
}
