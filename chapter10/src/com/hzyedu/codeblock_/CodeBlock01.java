package com.hzyedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        Movie movie1 = new Movie("唐探3", 100, "陈思诚");

    }

}

class Movie{
    private String name;
    private double price;
    private String director;

    //3个构造器 -> 重载
    //三个构造器中都有相同语句，比较冗余，可以放在一个代码块中
    //当我们不管调用哪个构造器创建对象，都会先调用代码块的内容
    //代码块调用优先于构造器
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("Movie(String name) 被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("Movie(String name, double price) 被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("Movie(String name, double price, String director) 被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
