package OopsConcept;

public class Inheritance2 {
	static int x=20;
	static int y=30;
	public static void main(String[] args) {
		System.out.println(Inheritance2.x);
		System.out.println(Inheritance2.y);
	}
}

class Test1 extends Inheritance2{
	static int z=100;
	public static void main(String[] args) {
		System.out.println(Test1.x);
		System.out.println(Test1.y);
		System.out.println(Test1.z);
	}
}

class Sample extends Test1{
	public static void main(String[] args) {
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		System.out.println(Sample.z);
	}
}
