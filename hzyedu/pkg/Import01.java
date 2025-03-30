package com.hzyedu.pkg;

//import java.util.Scanner;  //表示只会引入包中的Scanner
//import java.util.*;  //表示会引入包中的所有类

import java.util.Arrays;

public class Import01 {

    public static void main(String[] args) {

        int[] arr = {-1 , 20 , 2 , 13 , 3};
        //利用系统提供的arrays类进行数组排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
