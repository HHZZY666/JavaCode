package com.hzyedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建对象实例时（new）
//        AA aa = new AA();
        //创建子类对象实例时，父类也会被加载，且父类先被加载
//        AA aa1 = new AA();
        //使用类的静态成员时（静态属性，静态方法）
//        System.out.println(Cat.n1);
        //static代码块是在类加载时执行的，且只会执行一次
//        DD dd = new DD();
//        DD dd1 = new DD();

        System.out.println(DD.n1);
    }
}

class DD{
    public static int n1 = 888;
    static {
        System.out.println("DD 的静态代码块1被执行...");
    }
    //普通代码块，再new对象时被调用，且每创建一个对象，就调用一次
    //与类是否加载无关
    {
        System.out.println("DD的普通代码块...");
    }
}

class Animal{
    public static int n2 = 666;
    static {
        System.out.println("Animal 的静态代码1被执行...");
    }
}

class Cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("Cat 的静态代码1被执行...");
    }
}

class BB {
    static {
        System.out.println("BB的静态代码块1被执行...");
    }
}

class AA extends BB {

    //静态代码块
    static {
        System.out.println("AA的静态代码块1被执行...");
    }
}


