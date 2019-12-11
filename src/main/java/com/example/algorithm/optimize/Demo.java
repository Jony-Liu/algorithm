package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jonyliu
 */
public class Demo {

    /**
     * 尽量减少对变量的重复计算
     */
    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //...
        }
        for (int i = 0, length = list.size(); i < length; i++) {
            //...
        }
    }
}
