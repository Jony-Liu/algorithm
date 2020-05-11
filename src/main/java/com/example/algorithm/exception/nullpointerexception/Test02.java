package com.example.algorithm.exception.nullpointerexception;

import com.google.common.base.Strings;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * @author Jony-Liu
 * @date 2020/5/11 22:31
 * 使用那些已经对 null 值做过判断的方法，如 String#equals、String#valueOf、以及三方库中用来判断字符串和集合是否为空的函数
 */
public class Test02 {

    public void test(String str, Object obj, Collection col){
        if (str != null && str.equals("text")) {}
        if ("text".equals(str)) {}
        if (obj != null) { obj.toString(); }
        String.valueOf(obj); // "null"
        // from spring-core
        StringUtils.isEmpty(str);
        CollectionUtils.isEmpty(col);
        // from guava
        Strings.isNullOrEmpty(str);
        // from commons-collections4
        CollectionUtils.isEmpty(col);
    }

}
