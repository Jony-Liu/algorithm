package com.example.algorithm.optimize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 懒加载，即在需要的时候才创建
 * @author jonyliu
 * @date 2019/12/12 8:55
 */
public class LazyLoad {

    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        int i = 1;
        String str = "aaa";if (i == 1)
        {
            list.add(str);
        }
        //instead
        if (i == 1)
        {
            String str1 = "aaa";
            list.add(str1);
        }
    }

}
