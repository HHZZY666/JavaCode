package com.hzyedu.extend_.improve_;

//Pupil和Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;
    //共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("学生\t" + name + "\t年龄 " + age + "\t成绩 = " + score);
    }
}
