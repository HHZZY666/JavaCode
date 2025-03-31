package com.hzyedu.extend_;

public class Sub extends Base{
    public Sub (){
        System.out.println("sub()...");
    }
    public void sayOk(){
        //父类的非private属性和方法都可以访问
        //但private属性和方法无法在子类中直接访问
        System.out.println(n1 + " " + n2 + " " + n3   );
        test100();
        test200();
        test300();
        //test400();错误
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
