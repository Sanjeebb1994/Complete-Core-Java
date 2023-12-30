package module2;

public class Chapter2 {
	/*
	 * What is type casting:
	 * Converting one data type to another data type is called type casting.
	 * There are two types of type casting:
	 * 1. Primitive type casting  2. Non-Primitive type casting.
	 * Primitive casting further divide into three types:
	 * 1. Implicit type casting 2. Explicit type casting 3. Boolean Type casting
	 * 
	 * If one data types convert to another data types by compiler without use any extra piece 
	 * of coding is called implicit/auto type casting.
	 * Here lower types of data convert to higher type of data so it is called promotion type casting.
	 */
	public static void main(String[] args) {
		byte b=10;
		int x=b;//implicit type casting
		System.out.println(x);//10
		
		int y =208;
		byte s=(byte)y;//Explicit type casting.
		System.out.println(s);
		/*
		 * If lower data types convert to higher data types by programmer with using extra piece 
		 * of code is called explicit/force type casting.
		 * If higher type of data comes out the range of lower types of data range then some data might be loss.
		 * 
		 */
		//WAP to print the ASCII value.
		for(int i=0;i<150;i++) {
			char ch=(char)i;
			System.out.println(i+"=="+ch);
		}
	}
}

/*
 * Constructor chaining: Invoking one constructor inside another constructor is called constructor chaining.
 * Constructor chaining are two types:
 * 1. Constructor chaining within same class.
 * 2. Constructor chaining out side the class.
 * One constructor invoking another constructor in same class and that constructor invoking another constructor in same class.
 */
class Test{
	
	Test(){
		this(123);//Here this() is a statement which is using to calling one constructor inside another constructor.
		//this("Sanjeeb");//Two this statement can't be use in a single constructor.
		System.out.println("Normal constructor is running...");
		//this("Sanjeeb");//This statement must be the first statement of the constructor.
	}
	Test(int x){
		 this("Sanjeeb");
		 System.out.println(x+" Int constructor is running...");
	}
	Test(String name){
		//this();//Error recursive constructor invocation.
		System.out.println(name+" String constructor is running...");
	}
	public static void main(String[] args) {
		Test t=new Test();
	}
}
/*
 * by using this() statement we are using to perform constructor chaining within the same class.
 * This statement must be the first statement of constructor.
 * We can't be use this statement in all constructor of a class if we declare then we will get error.
 * Otherwise we will get Error recursive constructor invocation error.
 */

//Constructor chaining with different class.
/*
 * If One constructor calling other class constructor and that constructor calling another class constructor 
 * then that is called constructor chaining with different class.
 */
class Test10{
	
	Test10(String s){
		System.out.println("Test class constructor is Running..");
	}
}

class Demo1 extends Test10{
	Demo1(int num){
		super("Sanjeeb");
		System.out.println("Demo class constructor is Running...");
		//super("Sanjeeb");// Super statement always be the first statement of the constructor.
	}
	
}

class Sample1 extends Demo1{
	
	Sample1(){
		super(123);
		//super("Sanjeeb");Two super statement can't be use at a time.
		System.out.println("Sample1 constructor is Running...");
	}
}

class DemoSample extends Sample1{
	public static void main(String[] args) {
		
		Sample1 s1=new Sample1();
	}
}
/*
 * super() statement is used to perform constructor chaining of outer class.
 * super statement should always be the first statement of constructor.
 * Two super() statement can't be use at a time.
 */
/*
 * According to the java super() statement is compulsory for each and every constructor.
 * If programmer is forget to mention then complier automatically invoke it.
 * But super() statement generated by compiler always non-argument type. 
 */

class Test11{
	Test11(/*int x*/){ //Compiler can't be invoke argument type constructor.
		System.out.println("Test class constructor is running...");
	}
}

class Demo11 extends Test11{
	Demo11(){
		System.out.println("Demo class constructor is running...");
	}
}

class Sample11 extends Demo11{
	Sample11(){
		System.out.println("Sample class constructor is Running...");
	}
}

class SampleTest1 extends Sample11{
	public static void main(String[] args) {
		Sample11 s11=new Sample11();
	}
}
//Important**: this() and super() can not be present at a time..


















