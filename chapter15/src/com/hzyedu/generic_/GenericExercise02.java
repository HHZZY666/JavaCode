package com.hzyedu.generic_;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("smith", 55000, new MyDate(2005, 6, 22)));
        employees.add(new Employee("marry", 36000, new MyDate(2004, 7, 26)));
        employees.add(new Employee("marry", 28000, new MyDate(2005, 12, 10)));

        //直接输出
        System.out.println("employee = " + employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照 name 排序，如果 name 相同，则按生日日期的先后排序
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不匹配...");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }

                //下面是对 birthday 的比较，因此考虑将他放到 MyDate类 中
//                //如果name相同，就比较birthday-year
//                int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
//                if(yearMinus != 0){
//                    return yearMinus;
//                }
//                //如果同一年，比较month
//                int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
//                if(monthMinus != 0){
//                    return monthMinus;
//                }
//                //如果year , month 都相同
//                return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();

                //封装后的可维护性和复用性大大增强
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

        System.out.println("===对雇员进行排序===");
        System.out.println("employee = " + employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {

        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果同一年，比较month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果year , month 都相同
        return day - o.getDay();
    }
}

/**
 * 定义 Employee 类
 * 1) 该类包含：private 成员变量 name,sal,birthday，其中 birthday 为 MyDate 类的对象；
 * 2) 为每一个属性定义 getter, setter 方法；
 * 3) 重写 toString 方法输出 name, sal, birthday
 * 4) MyDate 类包含: private 成员变量 month,day,year；并为每一个属性定义 getter, setter 方法；
 * 5) 创建该类的 3 个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），对集合中的元素进
 * 行排序，并遍历输出：
 * <p>
 * 排序方式： 调用 ArrayList 的 sort 方法 , * 传入 Comparator 对象[使用泛型]，先按照 name 排序，如果 name 相同，则按生日日期的先后排序。【即：定制排序】
 * 有一定难度 15min , 比较经典 泛型使用案例 GenericExercise02.java
 */
