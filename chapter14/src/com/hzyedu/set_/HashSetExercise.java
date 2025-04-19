package com.hzyedu.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("韩顺平",18));
        hashSet.add(new Employee("韩昭阳",19));
        hashSet.add(new Employee("韩顺平",18));
        hashSet.add(new Employee("丁真",20));

        System.out.println(hashSet);

        for (Object o : hashSet) {
            System.out.println(o);
        }

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
