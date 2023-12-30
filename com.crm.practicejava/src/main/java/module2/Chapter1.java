package module2;

public class Chapter1 {
	//Constructor name must be same as class name.
	int x=10;
	Chapter1(){
		System.out.println("My own constructor is running...");
	}
	//constructor always comes first priority basis.
	public static void main(String[] args) {
		Chapter1 c1=new Chapter1();
		System.out.println(c1.x);
	}
}
/*Constructor are two types:
 * 1. Constructor without argument
 * 2. Constructor with argument.
 */
class Test1{
	int x=10;
	Test1(int x){
		System.out.println("My own construor is running...");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1(10);
		System.out.println(t1.x);
	}
}
/*
 * Non-static member member can't be access inside the static area.
 */
class Veichle{
	          
	int milage;
	String Name;
	Veichle(String Name,int milage){
		this.Name=Name;
		this.milage=milage;
	}
	public static void main(String[] args) {
		Veichle v=new Veichle("CD100 SS",120);
		Veichle v1=new Veichle("Honda",80);
		Veichle v2=new Veichle("Hero",90);
		
		System.out.println("Veichle Name is:: "+v.Name+" Millage is:: "+v.milage);
		System.out.println("Veichle Name is:: "+v1.Name+" Millage is:: "+v1.milage);
		System.out.println("Veichle Name is:: "+v2.Name+" Millage is:: "+v2.milage);
		
	}
}

class Test2{
	int x=10;
	static int y=20;
	Test2(int x){
		this.x=x;
	}
	public void m1() {
		System.out.println("Nonstatic variable calling from nonstatic are:: "+this.x);
	}
	
	public static void m2() {
		System.out.println("Static"+y);
		//System.out.println(this.x);//We can't be call non static variable in any static area by using this keyword.
	}
	
	public static void m3() {
		//System.out.println(x);Same thing happen here 
		//System.out.println(x);//Even though after creating constructor also this will not work.
	}
	
	public void m4() {
		System.out.println(x);
		System.out.println(y);//Static variable we can call in non-static area.
	}
	
	public static void main(String [] args) {
		Test2 t2=new Test2(12);
		Test2 t3=new Test2(13);
		t2.m1();
		m2();
		t2.m4();
		t3.m4();
	}
	
}


//Constructor OverLoading : Define same constructor multiple time by passing multiple argument is called constructor overloading

  class Test3{
	  
	  Test3(int x){
		  System.out.println("Int constructor is running...");
	  }
	  
	  Test3(String str){
		  System.out.println("String constructior is Running...");
	  }
	  
	  Test3(int x, String str){
		  System.out.println("Int and String constructor is Runing...");
	  }
	  public static void main(String[] args) {
		
		  Test3 t3=new Test3(12);
		  Test3 t4=new Test3(14,"Sanjeeb");
		  Test3 t5=new Test3("Rajib");
	}
  }





