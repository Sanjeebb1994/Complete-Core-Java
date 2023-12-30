package module2;

public class Chapter5 {
	
	/*
	 * Non-Premetive type casting:
	 * Converting non-premitive Data type(NPDT) to another NPDT is called Non-premetive typeCasting.
	 * There are two types of non-premetive casting.
	 * 1. Up-Casting 2. Down-Casting.
	 * 1. UPcasting:
	 * After performing inheritance transfer sub class property to super class is called up-casting.
	 * In Up-Casting property deliver by parent class and property receive by child class is different.
	 * In Up-Casting we will get override implementation.
	 * 
	 *  In Up-Casting only that property is eligible which comes from parent class.
	 *  
	 *  2. Down Casting:
	 *  After performing up-casting transfer super class property to subclass is called down casting.
	 *  
	 *  To perform down casting up casting is mandatory 
	 *  Here the property transfer by child class and the property receive by child class always same.
	 *  
	 *  To perform down casting programmer needs to write extra piece of code hence it is called force casting.
	 */
		public static void main(String[] args) {
			
		}
}

	class Father5{
		public void m1() {
			System.out.println("m1 is running from parent class...");
		}
		
		public void m2() {
			System.out.println("m2 is running from parent class...");
		}
		
	}

	class Son5 extends Father5{
		
		@Override
		public void m1() {
			System.out.println("m1 is running from child class..");
		}
		
		@Override
		public void m2() {
			System.out.println("m2 is running from child class..");
		}
		
		//@Override
		public void m3() {
			System.out.println("m3 is running from child class..");
		}
		
		public static void main(String[] args) {
			
			System.out.println("Normal object creation: ");
			
			Son5 s5=new Son5();
			s5.m1();
			s5.m2();
			s5.m3();
			
			System.out.println("Up-Casted object creation: ");
			
			Father5 f5=new Son5();
			f5.m1();
			f5.m2();
			//f5.m3();// Not possible because m3() is not belongs to parent class.
			
			System.out.println("Down-Casting object creation: ");
			
			//Son5 s=new Father5();//CTE
			Son5 s=(Son5)f5;//Down casted object creation.
			s.m1();
			s.m2();
			s.m3();
			//Here super class is refereed by subclass
			//Up-Casted object is only qualify for down-casting.
		}
	}
	
	class RBI1{
		
		public void repoRate() {
			System.out.println("Ripo Rate is 5.1%..");
		}
	}
	
	class SBI1 extends RBI1{
		
		@Override
		public void repoRate() {
			System.out.println("Ripo Rate is 6.1%...");
		}
		
		public void fdRate() {
			System.out.println("FD Rate is 4.1%...");
		}
		
		public static void main(String[] args) {
			System.out.println("Normal Object creation..");
			RBI1 r2=new SBI1();
			r2.repoRate();
			SBI1 s1=new SBI1();
			s1.repoRate();
			s1.fdRate();
			System.out.println("Up casted object...");
			RBI1 r1=new SBI1();
			r1.repoRate();
			System.out.println("Down Casted object...");
			SBI1 s= (SBI1)r1;
			s.repoRate();
			s.fdRate();
			System.out.println("Complete all the type casting..");
		}
	}
	
	class A10{
		
		public void m1() {
			System.out.println("Hi");
		}
	}
	
	class B10 extends A10{
		@Override
		public void m1() {
			System.out.println("Bye");
		}
	}
	
	class C10 extends B10{
		@Override
		public void m1() {
			System.out.println("Why");
		}
		
	}
	
	//Case-1
	class Test20{
		
		public static void main(String[] args) {
			A10 a1=new A10();
			a1.m1();//Hi
			A10 a2=new B10();
			a2.m1();//Bye
			A10 a3=new C10();
			a3.m1();//Why
			B10 b1=new C10();
			b1.m1();//Why
			C10 c1=new C10();
			c1.m1();//Why
			C10 c2= (C10)b1;
			c2.m1();//Why
			C10 c3=(C10)a3;
			c3.m1();//why
			B10 b2=(B10)a2;
			b2.m1();//Bye
		}
	}
	
	// Case-2
	class Test30{
		
		public static void m1() {
			System.out.println("Hi");
		}
	}
	
	class Test31 extends Test30{
//		@Override
		public static void m1() {
			System.out.println("Bye");
		}
	}
	
	class Test32 extends Test31{
//		@Override
		public static void m1() {
			System.out.println("Why");
		}
	}
	
	class Sample30{
		
		public static void main(String[] args) {
			
			Test30 t1=new Test30();
			t1.m1();//Hi
			Test30 t2=new Test31();
			t2.m1();//Hi
			Test30 t3=new Test32();
			t3.m1();//Hi
			
			Test31 t4=new Test32();
			t4.m1();//Bye
			Test32 t5=new Test32();
			t5.m1();//Why
//			Test32 t6=new Test31();
			Test32 t7=(Test32)t3;
			t7.m1();//why
			Test31 t8=(Test31)t2;
			t8.m1();//Bye
			
		}
	}
	/*
	 * Object always refer to current class memory. Since Parent class contains static method
	 * object always prefer to the parent class object.
	 * 
	 * Hence static method we can't be Override ever, If we try to override then it will perform
	 * MethodHiding or MethodShadowing.
	 */
	
	//Case3:
	class Demo30{
		int x=23;
	}
	
	class Demo31 extends Demo30{
		
		int x=230;
	}
	
	class Demo32 extends Demo31{
		
		int x=2300;
	}
	
	class SampleDemo30{
		
		Demo30 d1=new Demo30();
//		d1.x=300
		/*
		 * We never override the variable and static method.
		 * Hence non-static method is only one member which we can Override.
		 */
	}
	
	//Case4:
	class TestDemo30{
		
		public static void main(String[] args) {
			
			m1();//m1 Running with no-argument.
			m1(123);//m1 Running with int argument..
			m1("Sanjeeb");//m1 Running with String argument...
			
		}
		
		public static void m1() {
			System.out.println("m1 Running with no-argument.");
		}
		
		public static void m1(int x) {
			System.out.println("m1 Running with int argument..");
		}
		
		public static void m1(String str) {
			System.out.println("m1 Running with String argument...");
		}
	}
	
	/*
	 * Hence proved that static method can only perform compile-time polymorphism i.e., Only method Overloading.
	 * Where as non-static method can perform both compile-time polymorphism as well as Runtime Polymorphism.
	 * That mean both method Overloading and method Overriding as well.
	 * 
	 * Since constructor is only responsible for inheritance, constructor never perform polymorphism.
	 */
	
	                    //<--    Polymorphism Complete   -->
	
	
	
	
	