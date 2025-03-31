package com.hzyedu.extend_;

//输入ctrl + H 可以看见类的继承关系
public class Sub extends Base {
    public Sub() {
        //super();//默认调用父类的无参构造器
        super("fuck", 900);
        System.out.println("子类 Sub()构造器被调用...");
    }

    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom", 30);
        //do nothing...
        System.out.println("子类 Sub(String name)构造器被调用....");
    }

    public Sub(String name, int age) {
        //1. 老师要调用父类的无参构造器, 如下或者 什么都不写,默认就是调用 super()
        //super();//父类的无参构造器
        //2. 老师要调用父类的 Base(String name) 构造器
        //super("hsp");
        //3. 老师要调用父类的 Base(String name, int age) 构造器
        super("king", 20);
        //细节： super 在使用时，必须放在构造器第一行
        //细节: super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        //this() 不能再使用了
        System.out.println("子类 Sub(String name, int age) 构造器被调用....");
    }
        public void sayOk() {
            //父类的非private属性和方法都可以访问
            //但private属性和方法无法在子类中直接访问
            System.out.println(n1 + " " + n2 + " " + n3);
            test100();
            test200();
            test300();
            //test400();错误
            System.out.println("n4 = " + getN4());
            callTest400();
        }
    }
