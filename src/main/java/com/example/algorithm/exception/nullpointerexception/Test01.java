package com.example.algorithm.exception.nullpointerexception;

import com.google.common.base.Preconditions;
import lombok.NonNull;

import java.util.Objects;

/**
 * @author Jony-Liu
 * @date 2020/5/11 22:12
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            testObjects("hello");
            testGuava("hello");
            testLombok(null);
            testLombokGenerated("hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testObjects(Object arg) {
        Object checked = Objects.requireNonNull(arg, "arg must not be null");
        System.out.println(checked.toString());
    }

    public static void testGuava(Object arg) {
        Object checked = Preconditions.checkNotNull(arg, "%s must not be null", "arg");
        System.out.println(checked.toString());
    }

    public static void testLombok(@NonNull Object arg) {
        System.out.println(arg);
        System.out.println(arg.toString());
    }

    public static void testLombokGenerated(Object arg) {
        if (arg == null) {
            throw new NullPointerException("arg is marked @NonNull but is null");
        }
        System.out.println(arg.toString());
    }
}
