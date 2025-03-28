public class Constructor01 {
	public static void main (String[] args){
		//当new一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("smith",80);
		System.out.println("p1的信息如下：");
		System.out.println("name = " + p1.name);
		System.out.println("age = " + p1.age);
	}
}

//创建人类的对象时，就直接指定这个对象的年龄和姓名
class Person {
	String name;
	int age;

	//构造器没有返回值，也不能写void
	//构造器名称和类名称相同  
	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}
}