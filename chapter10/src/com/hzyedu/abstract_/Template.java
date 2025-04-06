package com.hzyedu.abstract_;

abstract public class Template { //抽象类--模板设计模式
    public abstract void job(); //抽象方法

    public void caculateTime(){ //实现方法，调用job
        //得到开始时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("时间执行时间 " + (end - start));
    }
}
