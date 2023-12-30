package module2;

public class Chapter4 {
	//2. Polimorphism:
	/*
	 * Polimorphism=Poly+morphism--> Here poly means many and morphism means forms.
	 * Obeject showing different behavior in different stage of it's life cycle.
	 * In java method is an only object which can able to perform polymerphism.
	 * Polymorphism is futher divide into two types:
	 * 1. Compile time polymorphism 
	 * 2. Run time polymorphism
	 * During the compilation based on the arguments Method declaration is get binded with method implementation by the compiler before the 
	 * execution is called compile time polymorphism. 
	 * Hence binding takes place before execution is called early binding.
	 * Hence the binding takes place only once it is called static binding.
	 * The best real time example of compile time polymorphism is 'Method Overloading'.
	 * 
	 * What is MehodOverloading ?
	 * Declaring the same method multiple time in same class by taking different argument is called method Overloading.
	 * 
	 */
	public static void main(String[] args) {
		
	}
}

class Test51{
	
	public void m1() {
		System.out.println("m1 running without any argument...");
	}
	
	public void m1(int x) {
		System.out.println("m1 running with int argument...");
	}
	
	public void m1(String s,int i) {
		System.out.println("m1 running with String and int argument..");
	}
	
	public static void main(String[] args) {
		Test51 t51=new Test51();
		t51.m1();
		t51.m1(123);
		t51.m1("Sanjeeb", 123);
	}

}

class Sample51{
	
	public void search(long accountNumber) {
		System.out.println("Your accout number is:: "+accountNumber);
	}
	
	public void search(String name, long mobNo) {
		System.out.println("Account is search by "+name+" contct number is:: "+mobNo);
	}
	
	public void search(long mobileNum,long adharNum) {
		System.out.println("Accoutn is search by "+mobileNum+" Adhar number is:: "+adharNum);
	}
	
	public static void main(String[] args) {
		Sample51 s51=new Sample51();
		s51.search(1234569L);
		s51.search("Sanjeeb", 7728342L);
		s51.search(5587444L, 1124778L);
	}
	
}

/*
 * 2. Runtime Polymorphism
 * Method declaration is going to get binded with method implementation by JVM during the execution
 * time based on the object creation is called runtime polymorphism.
 * Here binding take place after the compilation so, it is called as as late binding.
 * Here re-binding is possible hence it is called as dynamic binding.
 * Best real time example of  Runtime polymorphism is method overriding.
 * To perform runtime polymorphism successfully up casting is compulsory.
 * 
 * What is method Overriding?
 * Acquiring the property of parent class and giving new implementation inside child class is called method overriding.
 * 
 */

class Father{
	
	public void wish() {
		System.out.println("Happy Diwalli");
	}
}

class Child extends Father{
	
	public void wish() {
		System.out.println("Happy New Year..");
	}
	
	public static void main(String[] args) {
		Father f=new Father();
		f.wish();
		
		Child c=new Child();
		c.wish();
	}
}
/*
 * Override Annotation:
 * This will check particular method is override or not?
 * If we apply this annotation with other normal method then it will through compile time error.
 */
class Father1{
	
	public void wish() {
		System.out.println("Happy Diwali");
	}
}

class Child1 extends Father1{
	
	@Override
	public void wish() {
		System.out.println("Happy Dushera");
	}
	
	//@Override
	public void m1() {
		System.out.println("m1 method is running..");
	}
	
	public static void main(String[] args) {
		Father1 f1=new Father1();
		f1.wish();
		Child1 c1=new Child1();
		c1.wish();
		c1.m1();
	}
}

class RBI{
	
	public void fdRate() {
		System.out.println("FD Rate is 4%..");
	}
}

class SBI extends RBI{
	
	@Override
	public void fdRate() {
		System.out.println("FD Rate is 8%..");
	}
}

class Axis extends RBI{
	
	@Override
	public void fdRate() {
		System.out.println("FD Rate is 9%..");
	}
}

class ICICI extends RBI{
	
	@Override
	public void fdRate() {
		System.out.println("FD Rate is 11%...");
	}
}

class CheckFDRate{
	public static void main(String[] args) {
		RBI rbi=new RBI();
		rbi.fdRate();
		SBI sbi=new SBI();
		sbi.fdRate();
		Axis axis=new Axis();
		axis.fdRate();
		ICICI icici=new ICICI();
		icici.fdRate();
	}
}















