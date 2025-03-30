import java.util.Scanner;

public class Test0{
	public static void main(String[] args){
		System.out.println("请输入层数");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		for (int i = 1; i <= n; i++){
			for (int k = 1; k <= n - i; k++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				if(i != n){
					if(j == 2 * i - 1 || j == 1 ){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}	
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
