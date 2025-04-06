package com.hzyedu.single_;

//懒汉式
public class SingleExercise02 {
    public static void main(String[] args) {
        GirlFriend02 instance = GirlFriend02.getInstance();
        System.out.println(instance);
        GirlFriend02 instance1 = GirlFriend02.getInstance();
        System.out.println(instance1);
        System.out.println(instance1 == instance);

    }
}

class GirlFriend02{
    private String name;
    private int age;

    private static GirlFriend02 girlFriend02;

    private GirlFriend02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static GirlFriend02 getInstance(){
        if (girlFriend02 == null){
            girlFriend02 = new GirlFriend02("咋了",800);
        }
        return girlFriend02;
    }

    @Override
    public String toString(){
        return "girlFriend{" + "name='" + name + '\'' + '}';
    }
}