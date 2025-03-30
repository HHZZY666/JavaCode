import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪资：");
        double sal = myScanner.nextDouble();
        System.out.println("这个人信息如下：");
        System.out.println("姓名：" + name + " 年龄：" + age + " 薪资：" + sal);
        myScanner.close();
    }
}