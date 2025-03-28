public class This01{
	public static void main(String[] args){

		Dog dog1 = new Dog("大壮",3);
		dog1.info();
	}
}

class Dog{
	String name;
	int age;

	//构造器中的name 是局部变量，而不是属性
	//构造器中的age  是局部变量，而不是属性
	public Dog(String name ,int age){   //构造器
		//this.name就是当前对象的属性name
		this.name = name ;
		//this.age 就是当前对象的属性age
		this.age = age;
	}

	public void info(){   //成员方法，输出属性x信息
		System.out.println(name + "\t" + age + "\t");
	}
} 