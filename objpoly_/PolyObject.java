package com.hzyedu.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {

        //animal编译类型就是Animal 运行类型就是Dog
        Animal animal = new Dog();
        animal.cry();//小狗汪汪叫

        //animal编译类型就是Animal 运行类型就是Cat
        animal = new Cat();
        animal.cry();//小猫喵喵叫
    }
}
