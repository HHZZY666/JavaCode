package com.hzyedu_.try_;

public class TryCatchExercise03 {
}
class Exception03{
    public static int method(){
        int i = 1;
        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else{
                names[3]= "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e){
            return ++i; //i=3 => 保存临时变量 temp = 3; ，最后返回此条，也就是3
        }
        finally {
            ++i; //i=4
            System.out.println("i = " + i); //i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}