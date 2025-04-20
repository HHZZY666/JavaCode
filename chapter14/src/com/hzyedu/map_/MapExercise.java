package com.hzyedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapExercise {
    public static void main(String[] args) {

        Map hashMap = new HashMap();

        hashMap.put(001,new Employee(001,"jack",35000));
        hashMap.put(002,new Employee(002,"tom",43000));
        hashMap.put(003,new Employee(003,"smith",13000));

        //keySet遍历
        System.out.println("=====增强for=====");
        Set keySet = hashMap.keySet();
        //增强for
        for (Object key : keySet) {
            Employee employee = (Employee) hashMap.get(key);
            if (employee.getSal() > 18000) {
                System.out.println(employee);
            }
        }
        //迭代器
        System.out.println("======迭代器======");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        //Employee employee = (Employee) hashMap.get(key);
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000) {
                System.out.println(employee);
            }
        }
    }
}

class Employee{
    private int id;
    private String name;
    private double sal;

    public Employee(int id, String name,double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "id = " + id + "\t姓名 = " + name + "\t薪资 = " + sal ;
    }
}
