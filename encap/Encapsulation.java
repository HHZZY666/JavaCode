package com.hzyedu.encap;

public class Encapsulation {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("哈哈哈哈哈哈哈哈哈");
        person.setAge(999);
        person.setSalary(300000000);
        System.out.println(person.info());

        //如果直接用构造器指定属性，防护机制会失效
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("=====Smith的信息=====");
        System.out.println(smith.info());

        //可以将set方法写在构造器中以解决

    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    //与构造器结合
    public Person() {
    }
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public  void setName(String name){
        //加入对数据的教校验
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("名字长度不对，需要2-6字符之间");
            this.name = "无名";
        }
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 150) {
            this.age = age;
        }else{
            System.out.println("年龄需要在合理区间");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //可以增加对当前对象的权限判断
        this.salary = salary;
    }

    public String info(){
        return "信息为 name =" + name + "\t年龄为 age = " + age + "\t薪水为 salary = " + salary;
    }
}
