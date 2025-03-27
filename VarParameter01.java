public class VarParameter01{
	public static void main(String[] args){
		HhhMythord m = new HhhMythord();
		//m.sum();
		System.out.println(m.sum(2,8,996));
		System.out.println(m.sum(2,89));
	}
}

class HhhMythord{

	public int sum(int... n){
		//System.out.println("接收的参数个数=" + n.length);

		int res = 0;
		for (int i = 0; i < n.length ; i++){
			res += n[i];
		}
		return res;
	}
}