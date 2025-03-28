public class ConstructorDetail {
	public static void main(String[] args){

		Person p = new Person("king",99);
		Person q = new Person("tom");
		System.out.println(p.name + "\t" + p.age);
		System.out.println(q.name);
	}
}

class Person {
	String name;
	int age;

	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	//构造器的重载
	public Person(String pName){
		name = pName;
	}
}