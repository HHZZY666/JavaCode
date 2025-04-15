package com.hzyedu_.try_;
import java.util.Scanner;

public class TryCatchExercise04 { }
class Exception04{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入整数：");
            try {
                num = Integer.parseInt(myScanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数！！！");
            }

        }
        System.out.println("输入的值为：" + num);

    }

}