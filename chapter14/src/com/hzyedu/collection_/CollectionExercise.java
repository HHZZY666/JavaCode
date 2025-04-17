package com.hzyedu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExercise {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Dog("大黄",3));
        col.add(new Dog("小白",7));

        //直接输出
        System.out.println("直接输出");
        System.out.println(col);

        //iterator遍历输出
        System.out.println("iterator遍历输出");
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);
        }

        //增强for遍历输出
        System.out.println("增强for遍历输出");
        for (Object Dog : col){
            System.out.println("Dog = " + Dog);
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
