package com.hzyedu.ststic_;

public class StaticMethod {
    public static void main(String[] args) {
        //创建两个学生对象
        Student tom = new Student("tom");
        tom.payFee(100);

        Student marry = new Student("marry");
        tom.payFee(200);

        //输出当前收到的总学费
        Student.showFee();
    }
}

class Student{
    private String name;
    //定义一个静态变量，累计学生学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }
    //当方法使用了static修饰后，该方法就是静态方法
    //静态方法就可以访问静态属性/变量
    public static void payFee(double fee){
        Student.fee += fee; //累积到
    }
    public static void showFee(){
        System.out.println("总学费：" + Student.fee);
    }
}
