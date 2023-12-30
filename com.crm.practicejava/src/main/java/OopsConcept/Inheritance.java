package OopsConcept;

public class Inheritance {
	
	static int x=10;//Static variable
	int y=20;// Non-static variable;
	
	//Constructor
	/*Inheritance(int x, int y){
		System.out.println("Constructor is runniing...");
		this.x=x;
		this.y=y;
	}*/
	
	//Block
	static {
		System.out.println("Static blok is Running...");
		x=50;
		//y=100;
	}
	
	{
		System.out.println("Non-static block is running...");
		y=30;
	}
	
	public void m1(String name) {
		
		System.out.println("My name is: "+name+" and X value is: "+Inheritance.x);
		System.out.println("Non-static variable is: "+this.y);
	}
	
	public static void main(String[] args) {
		System.out.println("Parent class is Running...");
		
	}

}

//child class
class Test extends Inheritance{
	public static void main(String[] args) {
		System.out.println("Child Test class is Running..");
		System.out.println(Test.x);
		System.out.println(Inheritance.x);
	}
}

