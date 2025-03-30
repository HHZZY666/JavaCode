public class VarParameter02{
	public static void main(String[] args){
		HhhMythord m = new HhhMythord();
		//m.sum();
		System.out.println(m.information("白宇哲", 90, 80));
		System.out.println(m.information("云熙", 95, 90, 100));
		System.out.println(m.information("韩昭阳", 100, 100, 100));
	}
}

class HhhMythord{

	public String information(String name, int... score){
		//System.out.println("接收的参数个数=" + n.length);

		int res = 0;
		for (int i = 0; i < score.length ; i++){
			res += score[i];
		}

		return name + score.length + "门课程的总成绩为： " + res;
	}
}