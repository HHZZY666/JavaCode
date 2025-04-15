package com.hzyedu_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }

    public void f2() throws FileNotFoundException,NullPointerException {
        //创建了一个文件对象
        //1.这里的异常是一个 FileNotFoundException 编译异常
        //2.使用前面讲过的 try-catch-finally
        //3.使用 throws ，抛出异常，让调用f2方法的调用者处理
        //4.throws后面的异常可以是方法中产生的异常，也可以是它的父类
        //5.throws关键字之后也可以是异常类别，即可以抛出多个异常
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}

