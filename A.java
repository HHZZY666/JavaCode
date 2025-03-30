package com.hzyedu.modifier;

public class A {

    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public void m1(){
        //在同一类中可以访问public，protected，默认和private修饰的
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
    }
}
