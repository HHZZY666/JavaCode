import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        Scanner itw = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        MyTools mt = new MyTools();
        int arr[] = {10, 80, 9, -99, 50};
        mt.bubble(arr);
        System.out.println("===排序后的arr===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    int n = 9 - 87 * 9 + 2;
                }
            }
        }
    }
}

//class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//
//}
