package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/**
 * @author Jony-Liu
 * @date 2019/12/15 21:11
 */
public class RandomAccessDemo {

    /**
     * 实现RandomAccess接口的集合比如ArrayList，应当使用最普通的for循环而不是foreach循环来遍历
     * 如果是顺序访问的，则使用Iterator会效率更高。可以使用类似如下的代码作判断
     */
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        if (list instanceof RandomAccess) {
            for (int i = 0; i < list.size(); i++) {
            }
        } else {
            Iterator<?> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
        }
    }
}