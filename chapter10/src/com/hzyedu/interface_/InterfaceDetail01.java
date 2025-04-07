package com.hzyedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //1.接口不能被实例化
        //new IA();
    }
}

interface IA{
    //2.接口中所有的方法是 public 方法, 接口中抽象方法，可以不用 abstract 修饰
    void say();
    void hi();

}

class Cat implements IA{
    //3.一个普通类实现接口,就必须将该接口的所有方法都实现,可以使用 alt+enter 来解决
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
//4.抽象类去实现接口时，可以不实现接口的抽象方法
abstract class Tiger implements IA{

}
