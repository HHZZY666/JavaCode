package com.hzyedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{

    private int n2 = getN2();

    {
        System.out.println("A的普通代码块01");
    }

    //静态属性初始化
    private static int n1 = getN1();
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2被调用...");
        return 200;
    }
    //无参构造器
    public A(){
        System.out.println("A()构造器被调用");
    }
}
