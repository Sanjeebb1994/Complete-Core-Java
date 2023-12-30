package OopsConcept;

public class Inheritance5 {
	//Static Variable-------------------------
    static int x=20;
    static String name="Bisu";
    static char special='*';
    static float hight=12.76f;
    //Static Methods---------------------------------
    public static void m1(long mobNo) {
    	System.out.println("My Mobile Number is:: "+mobNo);
    }
    //Static Block------------------
    static {
    	System.out.println("Parent class Static Block is Running.........");
    }
    //Main method------------------
    public static void main(String[] args) {
		System.out.println("Main Method is Running....");
	}
    //Non-Static Variables----------
    int y=30;
    String fNamae="Sanjeeb";
    char ch='&';
    double length=3.8847749;
    //Non-Static Block----------------
    {
    	System.out.println("Parent Non-static Block is Running...");
    }
    //Non-Static Methods--------------
    public void m1(int num) {
    	System.out.println("M1 method is running: "+num);
    }
    //Constructor--------------
    Inheritance5(int x){
    	System.out.println("Parent Constructor is Running");
    }
    
}

class Test5 extends Inheritance5{
	
	Test5(){
		super(23);//Super() statement is used to perform constructor chaining out side the other class.
		System.out.println("Child class constructor is Running...");
	}
	
	static {
		System.out.println("Child class static block is running...");
	}
	
	{
		System.out.println("Child non-static block is Running...");
	}
	public static void main(String[] args) {
		System.out.println(Test5.x);
		System.out.println(Test5.name);
		System.out.println(Test5.special);
		System.out.println(Test5.hight);
		//----------------------
		Test5.m1(8658506681L);
		//----------------------
		System.out.println("---------------------------------------");
		Test5 t5=new Test5();//Object creation by child class
		System.out.println(t5.y);
		System.out.println(t5.fNamae);
		System.out.println(t5.ch);
		System.out.println(t5.length);
		t5.m1(123);
		System.out.println("---------------------------------------");
		Inheritance5 i5=new Inheritance5(123);//Object creation by Parent class
		System.out.println(i5.y);
		System.out.println(i5.fNamae);
		System.out.println(i5.ch);
		System.out.println(i5.length);
		i5.m1(321);
		
		
	}
	
	
}

