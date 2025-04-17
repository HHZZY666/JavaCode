package com.hzyedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        System.out.println("直接输出：");
        System.out.println("col = " + col);

        System.out.println("遍历输出：");
        Iterator iterator = col.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);
        }

        System.out.println("增强for循环遍历输出：");
        //使用增强for，在Collection集合
        //增强for，底层仍然时迭代器
        //增强for，可以理解成简化版的迭代器
        //快捷方式 I
        for (Object book : col){
            System.out.println("book = " + book);
        }
        //增强for，也可直接在数组中使用
        System.out.println("增强for循环遍历数组：");
        int[] nums = {1,9,8,30};
        for (int i : nums){
            System.out.println("i = " + i);
        }
    }
}
