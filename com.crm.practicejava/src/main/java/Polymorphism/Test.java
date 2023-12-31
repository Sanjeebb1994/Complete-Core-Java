package Polymorphism;

//Case-1
public class Test {
	
	//Test t=new Test();//Globally
	
	public void m1() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Test t =new Test();// Normal Object creation
		t.m1();//Hi
		
		
		Test t1=new B();//Locally UpCasting
		t1.m1();//Bye
		
		Test t2= new C();//UpCasting
		t2.m1();//Why
	}
}

class B extends Test{
	
	@Override
	public void m1() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		B b=new B();//Normal Object creation
		b.m1();//Bye
		
		B b1=new C();//Up Casting
		b1.m1();//Why
		
		C c2=(C)b1;//Down Casting
		c2.m1();//Why
	}
}

class C extends B{
	@Override
	public void m1() {
		System.out.println("Why");
	}
	
	public static void main(String[] args) {
		C c=new C();// Normal Object Creation
		c.m1();//Why
		
		B b2=new C();// Up Casting.
		b2.m1();//Why
		
		int x=12;//left x     <----------       Right 12
		
		C c1=(C)b2;//Down Casting 
		c1.m1();//Why
		
		//C c2=(C)b1;
		
	}
}

//Case-2
class X{
	
	public static void m1() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		X x=new X();//hi
		x.m1();//Static object creation is not recommended
		
		X x1=new Y();//Up Casting
		x1.m1();//hi
		
		X x2=new Z();
		x2.m1();//hi
		
		
	}
}

class Y extends X{
	//@Override
	public static void m1() {
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		Y y=new Y();
		y.m1();//bye
		Y y1=new Z();//Up Casting 
		y1.m1();//Bye
	    
	}
}

class Z extends Y{
	
	//@Override
	public static void m1() {
		System.out.println("why");
	}
	
	public static void main(String[] args) {
		Z z=new Z();
		z.m1();//why
	}
}


