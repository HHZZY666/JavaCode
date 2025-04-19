package com.hzyedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");//k-v
        map.put("no2", "张无忌");//k-v
        map.put(new Car(), new Person());//k-v

        //解读：
        //1.k-v 最后是HashMap$Node node = newNode(hash, key, value, null)
        //2.k-v 为了方便程序员的遍历，还会创建EntrySet 集合，该集合存放元素的类型为 Entry
        //  而一个Entry 对象就有 k,v ->  EntrySet<Entry<K,V>> 即： transient Set<Map.Entry<K,V>> entrySet;
        //3.在entrySet中，定义的类型是 Map.Entry，但实际上存放的还是 HashMap$Node
        //  这是因为 HashMap$Node implements Map.Entry
        //4.当把 HashMap$Node 对象存放到entrySet 方便遍历，因为 Map.Entry 提供 K getKey(); V getValue(); 两个方法

        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet
        for (Object obj : set) {
            //System.out.println(obj.getClass()); //HashMap$Node
            //为了从HashMap$Node取出k-v
            //1.向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());

    }
}

class Car{}
class Person{}