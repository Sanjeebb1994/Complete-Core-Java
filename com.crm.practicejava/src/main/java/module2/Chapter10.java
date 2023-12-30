package module2;

public class Chapter10 {
	// <-- Abstraction -->
	
	/*
	 * It is one of the oops concept where hiding the implementation provide the functionality of
	 * the application is called abstraction.
	 * Why we should go for abstraction?
	 * 1. For Security
	 * 2. For Simplicity
	 * Who can perform abstraction?
	 * 1. Abstract class 
	 * 2. Interface
	 * How can perform abstraction?
	 * To perform abstraction programmer should have good knowledge on constructor, method and oops concept.
	 */
	
	//Coupling:
	/*
	 * If one application get binded with another application is called coupling.
	 * There are two types of coupling:
	 * 1. Tight Coupling: Here one application completely depends upon another application.
	 * 2. Loose Coupling: Here one application partially depend upon another application.
	 */
	public static void main(String[] args) {
		
	}
}

//1. Example of tight coupling:: 
class Fan{
	public void on() {
		System.out.println("Fan ON");
	}
	public void off() {
		System.out.println("Fan OFF");
	}
}

class HomeApplience extends Fan{
	public static void main(String[] args) {
		Fan f=new Fan();
		f.on();
		f.off();
	}
}

//2. Loose Coupling:
interface Switch{
	void on();
	void off();
}

class Fan1 implements Switch{
	@Override
	public void on() {
	  System.out.println("Fan On");
	}
	
	@Override
	public void off() {
		System.out.println("Fan Off");
	}
}

class TV implements Switch{
	 
	@Override
	public void on() {
		System.out.println("TV On");
	}
	
	@Override
	public void off() {
		System.out.println("TV Off");
	}
}

class Home{
	public static void main(String[] args) {
		Switch s=new Fan1();
		s.on();
		s.off();
		Switch s2=new TV();
		s2.on();
		s2.off();
	}
}

//            <-- Abstraction Complete -->