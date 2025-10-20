package org.alfonso.supplier3;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetLinkedList<K,V>
{
    private Map<K, List<V>> map = new TreeMap<>();

    public void add(K key, V value)
    {
        List<V> list = map.get(key);

        if (list != null)
        {
            list.add(value);
        }
        else
        {
            list = new LinkedList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
