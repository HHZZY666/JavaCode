package com.hzyedu.abstract_;

public class BB extends Template{
    public void job(){ //重写了Template的job方法
        long num = 0;
        for (int i = 1; i <= 999999999; i++) {
            num *= i;
        }
    }
}
