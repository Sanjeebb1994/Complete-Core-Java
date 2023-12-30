package module3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectClass {
	
	//<-- Object Class -->
	
	/*
	 * What is an Object class?
	 * The most common property required for each and every java class is group in one class is called Object class.
	 * Its a super most class present in java.lang.package.
	 * Each class directly or indirectly child of object class.
	 * Property present in Object class:
	 * 1. toString();
	 * 2. hashCode();
	 * 3. equals();
	 * 4. getClass();
	 * 5. finalize();
	 * 6. close();
	 * Those are available for normal object.
	 * 7. notify();
	 * 8. notifyAll();
	 * 9. wait();
	 * 10. wait(arg 0);
	 * 11. wait(arg 0, arg 1);
	 * Those are for Thread object.
	 */
	public static void main(String[] args) {
		
	}
}
//toString();
/*
 * It is use to convert entire object to String format.
 * As per the object class toString() method provides String representation of an object.
 */
class Demo{
	public static void main(String[] args) {
		Demo d=new Demo();
		String s=d.toString();
		System.out.println(s);
		//String representation of object is in this format: packageName.classname@unicode.
		System.out.println(d);
		//If we directly print the object then also internally JVM will call the toString();
	}
}

class Student{
	String name;
	int rollNo;
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public static void main(String[] args) {
		Student s=new Student("Raja",26);
		Student s1=new Student("Rani",35);
		System.out.println(s);
		System.out.println(s1);//packageName.classname@uniqCode.
		//If we really want to see the content present inside the object then we have to Override toString method.
		
	}
	
	@Override
	public String toString() {
		return "name: "+name+" RollNum: "+rollNo;
	}
	
}
//2. Hash Code.
//This is a unique code provide to each object by JVM. We use hash code in hash code mapping in collection for firstest searching purpose.

class DemoToString{
	public static void main(String[] args) {
		DemoToString dts=new DemoToString();
		DemoToString dts1=new DemoToString();
		System.out.println(dts.hashCode());// Return unique code int format.
		System.out.println(dts1.hashCode());
	}
}

class Student1{
	String name;
	int rollNum;
	static int count=101;
	Student1(String name){
		this.name=name;
		this.rollNum=count++;
	}
	
	public static void main(String[] args) {
		Student1 s1=new Student1("Raja");
		Student1 s2=new Student1("Rani");
		Student1 s3=new Student1("Chor");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("All student hash code are: ");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" RollNum: "+rollNum;
	}
	
	@Override
	public int hashCode() {
		return rollNum;
	}
	/*
	 * When want to give our own unique code to the object in sequence then we have to Override the hashCode();
	 * Mostly these concept are used in Hash Code base collection. 
	 */
}

//Equals: equals(Object obj) method always give address label comparison if two object comes from same address then it will return true otherwise false.

class Test1{
	int x=10;
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		System.out.println(t1.equals(t2));//Address label comparison always return boolean value.
		t1=t2;
	    System.out.println(t1.equals(t2));
	}
}
class Test2{
	int x=20;
	public static void main(String[] args) {
		Test2 t2=new Test2();
		Test2 t4=new Test2();
		System.out.println(t2.equals(t4));
		/*
		 * Even though both object focusing the same value still why it is giving false value.
		 * The reason is, .equls() method internally invoking == operator.
		 * and the functionality of == operator for permeative data types is content label comparison 
		 * but for NPDT is address label comparison. so, since object is comes under NPDT and 
		 * the address of both object is different it is giving false value.
		 * So to make content label comparison we have to override the equals method.
		 */
	}
	
	@Override
	public boolean equals(Object obj) {
		int n1=this.x;
		Test2 t=(Test2)obj;
		int n2=t.x;
		return n1==n2;
	}

}

//getClass:
/*
 This method return class types of Object created by JVM at the time of class loading.
 This class types of object will return all the class label information;
*/
class DemoField{
	int x=10;
	int y=12;
	{
		System.out.println("Non-static block is running...");
	}
	
	DemoField(int x){
		System.out.println("Constructor is running...");
		this.x=x;
	}
	
	public int m1() {
		System.out.println("m1 int return type method is running..");
		return 123;
	}
	public void m2() {
		System.out.println("m2 void method is running...");
	}
	public static void main(String[] args) {
		DemoField df=new DemoField(123);
		Class c=df.getClass();
		System.out.println("Fully qualified name of the class is:: ");
		System.out.println(c.getName());
		
		System.out.println("Get all variables name:: ");
		Field[] f=c.getDeclaredFields();
		for(Field fd: f) {
			System.out.println(fd);
		}
		
		System.out.println("Get all Methods name:: ");
		Method[] m=c.getDeclaredMethods();
		for(Method md:m) {
			System.out.println(md);
		}
		
		System.out.println("Get all Constructor name:: ");
		Constructor[] cd=c.getDeclaredConstructors();
		for(Constructor c1: cd) {
			System.out.println(c1.getName());
		}
		
		System.out.println("Get all Block name:: ");
	
	}
}

//Finalize():
/*
 * Can we invoke garbage collector explicitly ? Yes
 * Whenever Programmer deals with large number of code and he wants to delete unUsable object 
 * which are unnecessarily occupy memory that time programmer can call garbage collector to delete those unusable memory.
 * How can a programmer invoke GC.
 * 1. System.gc();
 * 2. Runtime.getRunTime.gc();
 * 
 */

class DemoGC{
	int num=23;
	public static void main(String[] args) {
		System.out.println("MMS");
		DemoGC d=new DemoGC();
		System.out.println(d.num);
		System.gc();
		System.out.println("MME");
		
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object Destroyed Sucessfully..");
	}
}

//Programmer must be derefferred the object.
//the object before destroying the object otherwise it will never destroy.
/*
 * There are 2 way to deRefferred the object:
 * 1. By declare the variable as null.
 * 2. By interchange the the reference Variable.
 */

//1. By declare the variable as null;
class SampleGC{
	int num=40;
	public static void main(String[] args) {
		System.out.println("MMS");
		SampleGC s=new SampleGC();
		System.out.println(s.num);
		s=null;
		System.gc();
		System.out.println("MME");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object destroy sucessfully...");
	}
}

/*
 * Synchronizing Issue in Java.
 * When interpreter call GC internally at the same time in JVM different process is running.
 * Interpreter: Who is executing the JAVA program in the main stack area.
 * GC: Who will destroy the object in stack area.
 * Basically in this process who will first reach to the target first that o/p will come.
 * To overcome this issue we have to give Java wait statement.
 */
class TestGC{
	int num=50;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("MMS");
		TestGC t=new TestGC();
		System.out.println(t.num);
		t=null;
		System.gc();
		Thread.sleep(500);
		System.out.println("MME");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object destroyed sucessfully..");
	}
}
//2. By interchange the reference.

class CheckGC{
	int num=100;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("MMS");
		CheckGC c1=new CheckGC();
		CheckGC c2=new CheckGC();
		System.out.println(c1.num);
		c2=c1;
		System.gc();
		Thread.sleep(500);
		System.out.println("MME");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Object destroy successfully...");
	}
}
//Finalize() is a method which will invoke by GC to remove all external dependency from an object which will going to be destroy.

//             <-- Object Class END -->









