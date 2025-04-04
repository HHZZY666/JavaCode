package com.hzyedu.pkg;

import com.hzyedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，
        System.out.println(a.n1 );
    }
}
