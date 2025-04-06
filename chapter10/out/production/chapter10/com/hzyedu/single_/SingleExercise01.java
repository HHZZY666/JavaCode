package com.hzyedu.single_;

public class SingleExercise01 {
    public static void main(String[] args) {
        Cat2 instance = Cat2.getInstance();
        System.out.println(instance);
        Cat2 instance1 = Cat2.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
        Cat2 catInstance = Cat2.getInstance();
        String catName = catInstance.CatName("");
        System.out.println(catName);
    }
}

class Cat2{
    private String name;

    private static Cat2 cat = new Cat2("喵喵");

    private Cat2(String name) {
        this.name = name;
    }

    public static Cat2 getInstance(){return cat;}

    public String CatName(String name){
        return cat.name;
    }

}
