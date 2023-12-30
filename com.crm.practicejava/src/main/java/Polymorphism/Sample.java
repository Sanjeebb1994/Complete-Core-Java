package Polymorphism;

public class Sample {
	//Runtime Polymorphism
	//Method Overriding.
	public static void main(String[] args) {
		
	}
}

class Father{
	public void wish() {
		System.out.println("Happy NewYear....");
	}
}

class Child extends Father{
	
	@Override
	public void wish() {
		System.out.println("Happy Diwali...");
	}
	
	public void m1() {
		System.out.println("Happy Dushera...");
	}
	public static void main(String[] args) {
		Child c =new Child();
		c.wish();
		Father f=new Father();
		f.wish();
	}
}

class RBI{
	public void fdRate() {
		System.out.println("Keep FD rate from 1% to 9%");
	}
}

class SBI extends RBI{
	@Override
	public void fdRate() {
		System.out.println("SBI FD ratae is 7%...");
	}
}

class Axix extends RBI{
	@Override
	public void fdRate() {
		System.out.println("AXIS FD rate is 8%...");
	}
}

class ICIC extends RBI{
	//@Override
	public void FDRate() {
		System.out.println("ICICI FD Rate is 11%...");
	}
}

class CheckFDRate{
	public static void main(String[] args) {
		RBI r=new RBI();
		r.fdRate();
		SBI s=new SBI();
		s.fdRate();
		Axix a=new Axix();
		a.fdRate();
		//ICIC i=new ICIC();
		//i.fd
	}
}
//Up casting:
class Parent{
	
	public void Vehicle() {
		System.out.println("CD100-SS Father Bike..."); 
	}
}

class Son extends Parent{
	
	@Override
	public void Vehicle() {
		System.out.println("Giving new Modification to CD100-SS...");
	}
	
	public void myVehicle() {
		System.out.println("My Own new Car.......");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.Vehicle();
//		Son s=new Son();
//		s.Vehicle();
//		s.myVehicle();
		//Up casting.
		Parent f=new Son();
		f.Vehicle();
		//Down Casting--> extra piece of coding -->For casting
		Son s=(Son)f;
		s.Vehicle();
		s.myVehicle();
	}
}
