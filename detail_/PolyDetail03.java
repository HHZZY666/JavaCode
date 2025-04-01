package com.hzyedu.poly_.detail_;

public class PolyDetail03 {

    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        //aa编译类型是AA ，运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
        //instanceOf判断的是运行类型

        Object obj = new Object();
        System.out.println(obj instanceof AA);
    }
}

class AA {}

class BB extends AA {}
