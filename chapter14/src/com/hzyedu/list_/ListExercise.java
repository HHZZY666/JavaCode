package com.hzyedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        List list = new ArrayList();
//        list.add("hello0");
//        list.add("hello1");
//        list.add("hello2");
//        list.add("hello3");
//        list.add("hello4");
//        list.add("hello5");
//        list.add("hello6");
//        list.add("hello7");
//        list.add("hello8");
//        list.add("hello9");
        for (int i = 0; i <10 ; i++){
            list.add("hello" + i);
        }
        System.out.println("list = " + list);
        list.add(2,"韩顺平教育");
        System.out.println("返回第五个元素");
        System.out.println(list.get(4));
        list.remove(6);
        list.set(6,"韩昭阳");

        //直接输出
        System.out.println("=====直接输出=====");
        System.out.println("list = " + list);

        //Iterator迭代器遍历
        System.out.println("====迭代器遍历====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }

        //增强for循环遍历
        System.out.println("==增强for循环遍历==");
        for (Object o : list) {
            System.out.println("o = " + o);
        }

    }
}
