package com.hzyedu.list_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class ListExercise02 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",19));
        list.add(new Book("三国","罗贯中",80));

        //遍历
        for(Object obj : list){
            System.out.println(obj);
        }

        //冒泡排序
        sort(list);

        System.out.println("===排序后===");

        for (Object o : list) {
            System.out.println(o);
        }


    }
    //静态方法
    public static void sort(List list){

        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出对象Book
                Book book1 = (Book) list.get(j);//向下转型
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        
    }

}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称："+ name + "\t\t价格：" + price+ "\t\t作者：" + author;
    }
}
