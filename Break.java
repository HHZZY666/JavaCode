import java.util.Scanner;

public class Break{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//String name = "";
		//int key;
		int chance = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("请输入姓名");
			String name = myScanner.next();
			System.out.println("请输入密码");
			int key = myScanner.nextInt();
			if("丁真".equals(name) && key == 666){
				System.out.println("恭喜你，登录成功~");
				break;
			}
			chance--;
			System.out.println("还剩下"+chance+"次机会");
		}
	}
}