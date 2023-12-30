package module2;

public class Chapter8 {
	
	//       <-- Abstraction -->
	/*
	 * Abstract means in complete by nature.
	 * Abstract is a keyword in java which use to define incomplete object.
	 * If any class or method is declared with abstract that means that class and method is in complete in nature.
	 */
//	
//	class Boy{
//		//This is not an abstract class since abstract keyword is not declare here.
//		
//	}
	public static void main(String[] args) {
		
	}

}

//Boy{
//	 This is also not a abstract class because class keyword is not used here.
//}

//class{
//	 This one also incorrect because class name is not mention here.
//}

abstract class Boy{
	//This one is correct way to declare abstract class.
}

class Boy1{
	
	//public void m1();// This one is incorrect way of declaring abstract method because abstract keyword is not there.
	//abstract private void m1();// This one also incorrect because a normal class can't be contains abstract method.
	//To contains any abstract class member class must be abstract in nature.
}

abstract class Boy2{
	
	abstract public void m1();
	
	
	public void m2() {
		/*
		 * An abstract class can contains both abstract and normal method..
		 */
	}
}
/*
 * We can't be inherit abstract class we will get CTE because a normal child class can't be inherit abstract class.
 * 
 */
//class Girl extends Boy2{
//	
//}

/*
    We 2 approach to resolve this issue.
    1. Make child class as abstract.
    2. Override the abstract method.
*/
abstract class Girl2 extends Boy2{
	
	@Override
	public void m1() {
		System.out.println("M1 is running from child..");
	}
	
	public static void main(String[] args) {
		//Girl2 g2=new Girl2();// We can't create instance for abstract class.
		//Object creation for abstract is not possible...
	}
}
/*
	Does abstract class contains any constructor ?
	Ans: Yes Abstract also contain constructor, then the question is even though abstract class
	contains constructor then still why we can't create an instance for abstract class.
	The answer for this question is function of constructor in abstract class is only to support
	inheritance and initialize & Re-initialize variable.
	
	 1. We can't declare private and abstract at a time because, private member can't be inherit
	 and to perform abstraction successfully we have to inherit the parent class.
	 2. We can't be declare static keyword along with abstract
	 because static member can't be override but abstract method must have to inherit.
	 but static member can't be Override.
	 3. We can't be declare abstract along with constructor.
	 because abstract compulsory to Override --> For Override compulsory to inherit but,
	 construct can't be inherit it self because it is only responsible for inheritance.
		
	// Note: So only non-stactic method can perform abstraction.
	
*/

abstract class Human{
	private int x;
	int y;
	static String name;
	
	/*abstract*/ Human() {
		/*
		 * abstract : compulsory to Override.
		 * override : compulsory to Inherit.
		 * constructor : can't be inherit.
		 */
	}
	abstract public void m1();
	public abstract int m2();
	abstract String m3();
	abstract protected void m4();
//	abstract private void m5();
	/*
	 *  private : No one can inherit.
	 *  abstract : Compulsory to inherit.
	 */
//	abstract public static void m1(); 
	/*
	 * Static : No one can Override.
	 * abstract : Compulsory to Override.
	 */
}

abstract class Design{
	
	public abstract void m1();
	public abstract String m2();
	public abstract int m3();
	public abstract int m3(int x);
	
}

class Map extends Design{
	
	@Override
	public void m1() {
		System.out.println("Void m1 method is running");
	}
	
	@Override
	public String m2() {
		System.out.println("String m2 method is Running");
		return "Sanjeeb";
	}
	
	@Override
	public int m3() {
		System.out.println("Int m3 method is Running");
		return 123;
	}
	
	@Override
	public int m3(int x) {
		System.out.println("int m3 method is running with int argument..");
		return 321;
	}
	
	public char m4() {
		System.out.println("Child m4 method is running...");
		return 'v';
	}
	public static void main(String[] args) {
		Map m=new Map();
		m.m1();
		m.m2();
		m.m3();
		m.m3(123);
		m.m4();
		Design d=new Map();//Up-casting is possible for abstract class.
		d.m1();
		d.m2();
		d.m3();
		d.m3(23);
		//d.m4();
		/*
		 * What is concrete class?
		 * A class which implements all the abstract methods of an abstract class is called a concrete class. 
		 */
	}
}

//Final: final is a keyword in Java to declare any variable as constant.
/*
 * If we declare any variable as final then we can't be re-initialize/modify it.
 * We can declare all the types variable as final.
 * 	1. Static.
 *  2. Non-Static.
 *  3. Final.
 */
class TestCheck01{
	final static int x=25;//static variable must have to initialize at the time of declaration.
	final int y=20;//since final variable has no-default value we can't declare it without initialize it.
	public static void main(String[] args) {
		final int x=10;// Since local variable has no default value we have to initialize it at the time of declaration.
		System.out.println(x);//Otherwise it will give runtime error.
		System.out.println(TestCheck01.x);
		TestCheck01 tc=new TestCheck01();
		System.out.println(tc.y);
		//x=12;
		//TestCheck01.x=34;
		//tc.y=14;
		// We can't be modify that.
	}
}
/*
 * Static variable: static variable we can initialize through static block.
 * Non-static variable: Non-static variable we can initialize through non-static block and constructor.
 * Local Variable: Local variable we can initialize at the time of declaration.
 */
 class SampleCheck01{
	 final static int x;
	 final int y;
	 static
	 {
		  x=32;
	 }
	 
	 {
		  y=50;
	 }
	 //OR
//	 public SampleCheck01() {
//		y=45;
//	}
	 
	 public static void main(String[] args) {
		final int x=79;
		System.out.println(x);
		System.out.println(SampleCheck01.x);
		SampleCheck01 sc=new SampleCheck01();
		System.out.println(sc.y);
	}
 }
class Statement{
	static int x;
	static 
	{
		x=1;
	}
	public static void main(String[] args) {
		while(x<=10) {
			System.out.println(x);
			if(x==5) {
				System.out.println("Here we skip the flow");
				x++;
				continue;
			}
			if(x==8) {
				System.out.println("Here we break the flow");
				break;
			}
			x++;
		}
	}
}
class Test1001{
	public static void main(String[] args) {
		while(10>5) {
			System.out.println("hi");
		}
//		System.out.println("bye");// constant are assign at the time of compilation.
	}
}

class Test1002{
	public static void main(String[] args) {
		int x=10;
		int y=5;
		while(x>y) {
			System.out.println("hi");
		}
		System.out.println("bye");// constant are assign at the time of compilation
	}
}

class Test003{
	public static void main(String[] args) {
		final int x=10;
		final int y=5;
		while(x>y) {
			System.out.println("hi");
		}
//		System.out.println("bye");//unreachable statement
	}
}
// Final on Method:
/*
 * We Can declare both static and non-static method as final.
 * But we can't be perform run-time polymorphism.
 * If we declare non-static method as final then we can't be perform method overriding.
 * if we declare static method as final then method hiding will not be happen.
 * But we can perform compile time polymorphism.
 */

class SampleCheck1001{
	final public void m1() {
		System.out.println("m1 method is runing..");
	}
	
	final public void m1(int x) {
		System.out.println("int m1 running");
	}
	
	final public static void m2(String name) {
		System.out.println("String m1 is running..");
	}
	final public static void m2() {
		System.out.println("m2 static method is running..");
	}
}

class DemoCheck1001 extends SampleCheck1001{
	
//	public void m1() {
//		//We can't override it
//	}
	
//	public static void m2() {
//		//We can't override it
//	}
	public static void main(String[] args) {
		
		DemoCheck1001 dc=new DemoCheck1001();
		dc.m1();
		dc.m1(123);
		dc.m2();
		dc.m2("String");
				
	}
}

//Final on class:
/*
 * Yes we can declare class as final but we can't be inherit that class.
 * That means final class has no child class.
 * Because final class member can't be override.
 */

final class Parent1001{
	
	final public void m1() {
		System.out.println("m1 method is runing..");
	}
	
	final public void m1(int x) {
		System.out.println("int m1 running");
	}
	
	final public static void m2(String name) {
		System.out.println("String m1 is running..");
	}
	final public static void m2() {
		System.out.println("m2 static method is running..");
	}
}

//class Child1001 extends Parent1001
//{
//	// Can't be inherit.
//}


// Final main method: But if parent class contains main method child class shouldn't have any main method.

class SampleCheck1002{
	final public static void main(String[] args) {
		System.out.println("Parent class main method...");
	}
}
class DemoCheck1002 extends SampleCheck1002{
	
//	public static void main(String[] args) {
//		
//	}
}

//Final on Block:
class SampleCheck1003{
	final int x;
	final static int y;
	
//	final//Block we can't be declare as final
	{
		x=23;
	}
	
	/*final*/ static {//Block we can't be declare as final
		y=45;
	}
}

// Final on Constructor: we can't be make constructor as final because constructor in java is by-default in nature..

class DemoCheck1004{
	
	final int x;
	/*final*/ public DemoCheck1004() {
		x=34;
	}
}


//           <-- Abstraction  Complete -->





