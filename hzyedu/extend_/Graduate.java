package com.hzyedu.extend_;
//大学生
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("大学生" + name + "正在考高等数学。。。");
    }
    public void showInfo(){
        System.out.println("学生\t" + name + "\t年龄 " + age + "\t成绩 = " + score);
    }
}
