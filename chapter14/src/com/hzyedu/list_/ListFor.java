package com.hzyedu.list_;

import java.util.*;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        //List 接口的实现子类 ArrayList Vector LinkedList
        //List list = new ArrayList();
        List list = new LinkedList();
        //List list = new Vector();
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");

        //遍历
        //1.迭代器
        System.out.println("===============");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //增强for
        System.out.println("==============");
        for (Object obj : list){
            System.out.println(obj);
        }

        //普通for
        System.out.println("==============");
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            Object object = list.get(i);
            System.out.println(object);
        }
    }
}
