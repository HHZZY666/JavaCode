public class Scope{
	public static void main(String[] arggs){
		Person p = new Person();
		p.say();

	}
}

class Person{

	String name = "jack";

	public void say(){
		//int n = 10;
		String name = "king";
		System.out.println("name = " + name);
	}
}