package module2;

public class Chapter3 {
	
	//Oops Concept: Oops stand for Object orient Programming.
	/*
	 * What is an object? 
	 * Object is nothing but an entity which has it's own state and behavior.
	 * Here state is represent the information about the object and behavior is represent the functionality of that particular object.
	 * According Java everything is considered as an Object and class is the area where object can show case it's functionality.
	 * Pillar of Oops:
	 * 1. Inheritance
	 * 2. Polymorphism 
	 * 3. Encapsulation
	 * 4. Abstraction
	 * 5. Interface
	 */
	//1. Polymerphism:
	/*
	 * Polymorphism is a concept in Java where one class transfer it's property to another class by using 'extends' keyword.
	 * In this concept two types of classes coming into the picture i.e., Parent class and Child class.
	 * The class which transfer it's property to other class is called parent/Super class.
	 * The class which receive the property from other class is called child/Sub class.
	 * There are 4 different types of Inheritance present:
	 * 1. Single label inheritance
	 * 2. Multi label inheritance
	 * 3. Multiple inheritance
	 * 4. Hirarchial inheritance.
	 */
	public static void main(String[] args) {
		
	}
	
	}
//1. Single label inheritance.
/*
* The inheritance which takes place in between two java class is called Single label inheritance.
*/
class A{
	int x;
	static int y;
	A(int x){
		System.out.println("Parent class constructor is running..");
		this.x=x;
	}
	public void m1() {
		System.out.println("Parent method is Running...");
	}
}

class B extends A{
	B(){
		super(23);
		System.out.println("Child class constructor is Running...");
	}
	public static void main(String[] args) {
		A a=new A(22);
		a.x=34;
		System.out.println(a.x);
		A.y=10;
		System.out.println(A.y);
		a.m1();
		B b=new B();
		b.x=100;
		System.out.println(b.x);
		B.y=200;
		System.out.println(B.y);
		b.m1();
		
	}
}
//2. Multilabel inheritance:
/*
 * The inheritance which takes place between more than 2 class is called multilabel inheritance.
 */
class X{
	int x=23;
	static int y1=34;
		X(int x){
		this.x=x;
		System.out.println("Super Parent class constructor is running...");
		}
		
		void m1() {
			System.out.println("m1 method is running...");
		}
}

class Y extends X{
	int y;
	static int y2;
	Y(int y){
		super(123);
		this.y=y;
		System.out.println("Parent class consruction is running...");
	}
	static void m2() {
		System.out.println("m2 method is running..");
	}
}

class Z extends Y{
	int z;
	static int y3;
	Z(int z){
	  super(332);
	  this.z=z;
	  System.out.println("Child class constructor is running...");
	}
	
	void m3() {
		System.out.println("m3 method is constructor is running...");
	}
	
	public static void main(String[] args) {
		Z z=new Z(998);
		z.x=1;
		System.out.println("X value is: "+z.x);
		z.y=2;
		System.out.println("Y value is: "+z.y);
		z.z=3;
		System.out.println("Z value is: "+z.z);
		z.m1();
		m2();
		z.m3();
		Z.y1=101;
		System.out.println(y1);
		Z.y2=102;
		System.out.println(y2);
		y3=103;
		System.out.println(Z.y3);
	}
}
//3. Hirarchial Inheritance.
/*
 * Here one parent class transfer it's property to multiple child class.
 * Here inheritance takes place between one Super class and multiple Sub class.
 */

class Test101{
	String name;
	static String str;
	Test101(String name){
		this.name=name;
		System.out.println("Parent class constructor is running...");
	}
	
	void m1() {
		System.out.println("m1 method is running now...");
	}
}
class Sample10 extends Test101{
	Sample10(){
		super("Sanjeeb");
		System.out.println("Child class constructor is running...");
	}
	
	public static void main(String[] args) {
		Sample10 s1=new Sample10();
		s1.name="Hello World";
		System.out.println(s1.name);
		Sample10.str="I am Sanjeeb";
		System.out.println(str);
		s1.m1();
	}
}

class Demo10 extends Test101{
	Demo10(){
		super("Ranjeeb");
		System.out.println("Child class constructor is running...");
	}
	
	public static void main(String[] args) {
		Demo10 d10=new Demo10();
		d10.name="Sanjeeb calling";
		System.out.println(d10.name);
		Demo10.str="Rajib Calling";
		System.out.println(str);
		d10.m1();
	}
}
//Impact of inheritance on class member..
/*
 * 1. Static member: We have 3 static member like block, variables and method.
 * All static variable can be inherit to it's child class.
 */
class Check1{
	static int a=12;
	static {
		System.out.println("Parent static block is running..");
	}
	static void m1() {
		System.out.println("m1 method is running....");
	}
}
// Note**: If parent class and child class having static block then in that case parent block will run first then child block.
class TestCheck1 extends Check1{
	static {
		System.out.println("Child block is running...");
	}
	public static void main(String[] args) {
		m1();
		System.out.println(a);
	}
}

//2.  Impact of inheritance for non-static member.
/*
 * All non-static member including block, variable and method can be inherit.
 */

class Check2{
	int x=24;
	
	{
		System.out.println("Parent Non-static block is running..");
	}
	
	void m1() {
		System.out.println("Non static method is running...");
	}
}
//Note**: If parent class and child class having block then in that case parent block will run first then child block.
class TestCheck2 extends Check2{
	{
		System.out.println("Child nonstatic block is running...");
	}
	
	public static void main(String[] args) {
		TestCheck2 tc2 =new TestCheck2();
		System.out.println(tc2.x);
		tc2.m1();
	}
}

//3. Impact of inheritance on main method.
/*
 * We can inherit main method also.
 */

class Check3{
	public static void main(String[] args) {
		System.out.println("Parent main method is running...");
	}
}
// If both parent and child class having main method then only current class main method will run.
class TestCheck3 extends Check3{
//	public static void main(String[] args) {
//		System.out.println("Child main method is running...");
//	}
}

//4. Impact of inheritance on constructor.
/*
 * Constructor is only class member which can't be inherit because constructor is only responsible
 * for inheritance.
 * When child class constructor invoke parent class constructor then only inheritance will happen.
 * So expect constructor all class member will able to perform inheritance.
 */
class Check4{
	Check4(/*int x*/){
		System.out.println("Parent class constructor is running...");
	}
}

class Test4 extends Check4{
	Test4(){
		System.out.println("Child class constructor is running...");
	}
	public static void main(String[] args) {
		Test4 t4=new Test4();
		
	}
}
/*
 * In above case o/p will come because of constructor chaining but not because of inheritance.
 */

//4. Multiple Inheritance:
/*
 * If one child class contains two parent class property at a time then it is called multiple inheritance.
 * In java multiple inheritance doesn't support for java class.
 * because two super class constructor can't be invoke to one child class constructor at a time
 * In case of confusion two object class can't be crate at a time object class property can't be reached to the subclass. 
 * In this case java will throw compile time error.
 * To avoid this situation we can refer multilabel inheritance or else we can use Interface.
 */
class Check5{
	Check5(){
		System.out.println("Parent1 class constructor is running...");
	}
	
	{
		System.out.println("Parent1 class block is running...");
	}
	
	void m1(){
		System.out.println("m1 method is running..");
	}
}

class Check6{
	Check6(){
		System.out.println("Parent2 class constructor is running..");
	}
	
	{
		System.out.println("Parent2 class block is running...");
	}
	
	void m1() {
		System.out.println("m1 constructor is running...");
	}
}

//class TestCheck4 extends Check5 extends Check6{
//	 Multiple inheritance can't be perform..
//}








