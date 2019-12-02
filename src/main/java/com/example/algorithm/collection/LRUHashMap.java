package com.example.algorithm.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Jony-Liu
 * @param <K>
 * @param <V>
 */
public class LRUHashMap<K,V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public LRUHashMap(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}
