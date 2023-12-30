package module2;

public interface Chapter9 {
	//Interface: It is 100% abstract in nature..
	/*
	 * --> Interface always declared with keyword as 'interface';
	 * --> Variable in interface is by default final in nature.
	 * --> Method in interface is by default abstract in nature.
	 * --> Blocks are not allowed in interface.
	 * --> Since there is no constructor in interface object creation is not possible.
	 * --> Multiple inheritance is possible here.
	 */
	int x=10;// public static final in nature;
	public static final int y=23;
//	static {
//		Static block not allow here
//	}
	
//	{
//		non-static block also not allow here
//	}
	
//	Chapter9(){
//		//constructor is also not allowed here.
//	}
	
	void m2();//methods are public abstract in nature.
	
	public abstract void m3();
	
//	 int m4() {
//		// method body is not allowed here. 
//	 }
}

//Inheritance with interface:
/*
 * There is two keyword used to perform inheritance in java.
 * 1. Extends 2. Implements
 * If two participants are same in that case extends keyword is use to perform inheritance.
 * e.g.: class extends class
 *  interface extends interface.
 *  but class extends interface --> error
 *  or interface extends class --> error
 *  
 *  class always implements interface.
 *  class implements interface.
 *  class implements class--> Error
 *  interface implements interface--> Error
 *  interface implements class--> invalid
 */

interface A01{
	public static final int z=23;
	int y=39;
}

interface B01{
	public abstract void m1();
	int m3();
	default public void m2() {
		//It's a new feature added by JDK-8 to overcome all the drawback or to fix some loophole.
		
	}
	
	public static void m4() {
		//It's a new feature added by JDK-8 to overcome all the drawback or to fix some loophole.
		//like: To provide constant functionality and provide a functionality which will not apply
		// forcefully implementation. but child can override that function based on the requirement.
		//we have to go for default non-static method.
	}
}

interface C{
	
}
interface Test1211 extends A01,B01,C{
	//Interface can inherit n no.of interface.
}

class DemoTest implements A01,B01,C{

	@Override
	public void m1() {
		
	}
	
	@Override
	public int m3() {
		return 123;
	}
	
}

class G extends DemoTest implements A01,B01,C{

	//First extends statement then implements statement will come.
	
}
/*
 * Abstract class prefer to contains based feature of the application.
 * where as interface prefer to contains advanced feature also it provide constant feature of that class.
 */

interface DRAMA{
	public static void m1() {
		System.out.println("Static interface method is running..");
	}
	
	default void m2() {
		System.out.println("Non-static interface method is running..");
	}
}

class TestDrama implements DRAMA{
	public static void main(String[] args) {
		DRAMA d=new TestDrama();//up casting;
		DRAMA.m1();//static method we can't be call via object we can directly call by interface name.
		d.m2();
		
	}
}
//           <-- Interface Complete -->