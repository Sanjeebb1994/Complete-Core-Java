package OopsConcept;

public class Inheritance3 {
	static int x=20;
	static int y=30;
	public static void main(String[] args) {
		System.out.println(Inheritance3.x);
		System.out.println(Inheritance3.y);
	}

}

class Test3 extends Inheritance3{
	public static void main(String[] args) {
		System.out.println(Test3.x);
		System.out.println(Test3.y);
	}
}

class Sample3 extends Inheritance3{
	public static void main(String[] args) {
		System.out.println(Sample3.x);
		System.out.println(Sample3.y);
	}
}

class Demo3 extends Inheritance3{
	public static void main(String[] args) {
		System.out.println(Demo3.x);
		System.out.println(Demo3.y);
	}
}
