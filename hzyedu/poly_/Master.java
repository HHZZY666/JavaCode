package com.hzyedu.poly_;

public class Master {
    private String name;
    public Master(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态机制，可以统一地管理主人喂食的问题
    //animal编译类型是Animal ，可以指向（接收）Animal子类的对象
    //food编译类型是Food ，可以指向（接收）Food子类的对象
    public void feed(Animal animal, Food food){
        System.out.println("主人 " + name + "给" + animal.getName() + "吃" + food.getName());
    }

    //主人给小狗喂骨头
//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人 " + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    //主人给小猫喂黄花鱼
//    public void feed(Cat cat,Fish fish){
//        System.out.println("主人 " + name + "给" + cat.getName() + "吃" + fish.getName());
//    }
}
