public class This02{
	public static void main(String[] args){

		Dog dog1 = new Dog("大壮",3);
		System.out.println("dog1.hashCode= " + dog1.hashCode());
		dog1.info();
		System.out.println("=========================");
		Dog dog2 = new Dog("大黄",9);
		System.out.println("dog2.hashCode= " + dog2.hashCode());
		dog2.info();
	}
}

class Dog{
	

	//构造器中的name 是局部变量，而不是属性
	//构造器中的age  是局部变量，而不是属性
	public Dog(String name ,int age){   //构造器
		//this.name就是当前对象的属性name
		this.name = name ;
		//this.age 就是当前对象的属性age
		this.age = age;

		System.out.println("this.hashCode= " + this.hashCode());
	}

String name;
	int age;
	public void info(){   //成员方法，输出属性x信息
		System.out.println("this.hashCode= " + this.hashCode());
		//System.out.println(name + "\t" + age + "\t");
	}
} 