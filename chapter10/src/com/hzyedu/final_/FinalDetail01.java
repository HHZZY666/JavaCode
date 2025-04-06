package com.hzyedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
    }
}

class AA{
    /*
    1.定义时
    2.构造器中
    3.代码块中
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA(){
        TAX_RATE2 = 9;
    }
    {
        TAX_RATE3 = 8;
    }
}

class BB {
    /*
    如果final修饰的是静态属性，则初始化位置只能是
    定义时 / 静态代码块中 ,不能在构造器中赋值
     */
    public static final double TAX_RATE = 99;
    public static final double TAX_RATE2;
    //public static final double TAX_RATE3;

    static {
        TAX_RATE2 = 55;
    }

//    public BB() {
//        TAX_RATE3 = 88;
//    }
}

//final类不能继承，但能实例化对象
final class CC{ }
//如果类不是final类，但是有final方法，则该方法虽然不能重写，但能继承
class DD{
    public void cal(){
        System.out.println("cal()方法");
    }
}
class EE extends DD{ }