import java.util.Scanner;

public class If{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double sco = myScanner.nextDouble();
        myScanner.nextLine();
        if (sco > 8.0){
            System.out.println("请输入性别：");
            String gen = myScanner.next();
            System.out.println(gen);
            if (gen.equals("男")){
                System.out.println("进入男子组决赛");
            }else if(gen.equals("女")) {
                System.out.println("进入女子组决赛");
            }else{
                System.out.println("错误");
            }
        }else{
            System.out.println("淘汰");
        }
    }
}