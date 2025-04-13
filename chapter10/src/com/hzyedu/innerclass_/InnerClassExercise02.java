package com.hzyedu.innerclass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("同学门上课了");
            }
        });
    }
}

interface Bell{ //接口
    void ring();//方法
}

class Cellphone { //类
    public void alarmClock(Bell bell){ //形参是接口类型
        bell.ring();
    }
}
