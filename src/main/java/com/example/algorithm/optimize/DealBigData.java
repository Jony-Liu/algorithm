package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/12/12 9:41
 */
public class DealBigData {

    /**
     * 当复制大量数据时，使用System的array copy命令
     */
    @Test
    public void test() {
        List<String> src = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            src.add(i + "");
        }
        Object[] s = src.toArray();
        Object[] strings = new String[2];
        System.arraycopy(s, 0, strings, 0, 2);
        System.out.println(strings.length);
    }
}
