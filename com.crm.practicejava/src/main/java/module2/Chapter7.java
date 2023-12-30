package module2;

public class Chapter7 {
	public static void main(String[] args) {
		Chapter6 s=new Chapter6();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.z);
//		System.out.println(s.l);
	}
}
/*
 * Encapsulation: It is an oops concept of java
 * Restricting any class member within that class only by using private keyword is called 
 * Encapsulation.
 * 1. Encapsulation with variable:
 *  Global variable can be encapsulate but local variable can't be encapsulate because by default it is already encapsulate.
 *  
 */
class Test001{
	private int x=10;
	private static int y=20;
	
	public static void main(String[] args) {
//		private int =30;
		Test001 t=new Test001();
		System.out.println(t.x);
		System.out.println(y);
	}
	
}
/*
 * If we declare any variable as private then we can't be access it outside the class.
 * If we really want to access it then we have to call getter method to access it out side the class.
 * And if we want to update that then we have to call setters method to update it out side the class. 
 */
class Test002{
	private int x=50;
	private String name="Sanjeeb";
	
	public int getX() {
		return x;
	}
	
	public String getNeme() {
		return name;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

class Demo001{
	public static void main(String[] args) {
		Test002 t=new Test002();
		String name=t.getNeme();
		System.out.println(name);
		int x=t.getX();
		System.out.println(x);
		t.setName("Ranjib");
		 name=t.getNeme();
		System.out.println(name);
		t.setX(200);
		x=t.getX();
		System.out.println(x);
		
		
	}
}
/*
 * Why we need private member in java?
 * To provide security on data, to hiding the data and to get control over the data we prefer private member.
 * 
 */
class DemoSample001{
	private String name;
	private int contactNum;
	private char bloodGroup;
	DemoSample001(String name, int contactNum, char bloodGroup){
		this.name=name;
		this.contactNum=contactNum;
		this.bloodGroup=bloodGroup;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getContactNum() {
		return contactNum;
	}
	
	public void setContactNum(int contactNum) {
		this.contactNum=contactNum;
	}
	
	public char getBloodGroup() {
		return bloodGroup;
	}
}

class SampleDemo001{
	public static void main(String[] args) {
		DemoSample001 ds=new DemoSample001("Sanjeeb", 756051, 'B');
		
		System.out.println(ds.getName());
		System.out.println(ds.getContactNum());
		System.out.println(ds.getBloodGroup());
		
		ds.setName("Rajib");
		ds.setContactNum(12345);

		System.out.println(ds.getName());
		System.out.println(ds.getContactNum());
		System.out.println(ds.getBloodGroup());
	}
}

class SampleDemo002 extends DemoSample001{

	SampleDemo002(String name, int contactNum, char bloodGroup) {
		super(name, contactNum, bloodGroup);
		// TODO Auto-generated constructor stub
	}
	SampleDemo002 sd2=new SampleDemo002("Sanjeeb",2345,'A');
	
}
/*
 * What is POJO class?
 * If a class contains private member and initialization of constructor and getters, setters method
 * as per the requirement then that class is considered as POJO class.
 */

class Employee{
	private String branch;
	private String name;
	private int empID;
	private char bloodGroup;
	private int contactNum;
	
	Employee(String branch,String name,int empID, char bloodgroup, int contactNum){
		this.branch=branch;
		this.name=name;
		this.empID=empID;
		this.bloodGroup=bloodgroup;
		this.contactNum=contactNum;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public char getBloodGroup() {
		return bloodGroup;
	}
	
	public int getContactNum() {
		return contactNum;
	}
	
	public void setBranch(String branch) {
		this.branch=branch;
	}
	
	public void setEmpID(int empID) {
		this.empID=empID;
	}
	
}

class EMPDB{
	public static void main(String[] args) {
		Employee e= new Employee("Electrical","Sanjeeb",12342,'B',756051);
		System.out.println(e.getBranch());
		System.out.println(e.getName());
		System.out.println(e.getEmpID());
		System.out.println(e.getBloodGroup());
		System.out.println(e.getContactNum());
		e.setBranch("ComputerScince");
		e.setEmpID(9903);
		System.out.println(e.getBranch());
		System.out.println(e.getName());
		System.out.println(e.getEmpID());
		System.out.println(e.getBloodGroup());
		System.out.println(e.getContactNum());
	}
}

class Test1010{
	
	private void m1() {
		System.out.println("Private m1 is running..");
	}
	
	private static void m2() {
		System.out.println("Private static m2 is running...");
	}
	
	private int m3() {
		System.out.println("M3 private method is running...");
		return 120;
	}
	
	//To access private method we have to call getter method.
	
	public void getm1() {
		m1();
	}
	
	public void getm2() {
		m2();
	}
	
	public int getm3() {
		return m3();
	}
}

class Demo1020{
	public static void main(String[] args) {
		Test1010 t=new Test1010();
		//t.m1();//m1() has private access
		//t.m2();//m2() has private access
		t.getm1();
		t.getm2();
		t.getm3();
	}
}

/*
 * We can't be apply setter concept on method because:
 * setter concept is applicable for modify the private member that means method overriding.
 * For Overriding inheritance is compulsory.
 * But private method can't be inherit.
 * 
 * Shall we make main method as private?
 * Ans: Yes, we can make main method as private it will not give any compile time error but,
 * it will through run time error.
 * 
 * Can we make block as private?
 * Ans: Blocks are not valid member for private because block has no identifier therefore 
 * it doesn't load in JVM memory.
 */

//Shall we make constructor as private?
/*
 * Ans is yes, we can make constructor as private but, before that we have to know about the impact.
 * Impact of private constructor inside class.
 * 1. We can't be create an object for that constructor anywhere inside the other class but in same class we can invoke.
 * 2. We can't be initialize or re-Initialize the variable.
 * So to access the private constructor programmer must have call the public static getters method.
 * 
 */
 class Tiger{
	 String name;
	 private Tiger(String name) {
		 System.out.println("Private constructor is running...");
		 this.name=name;
	 }
	 
	 public static Tiger getTiger(String name) {
		 Tiger t1=new Tiger(name);
		 return t1;
	 }
	 
	 public static void main(String[] args) {
		Tiger t=new Tiger("BangelTiger");
		Tiger t1=Tiger.getTiger("Sa");
	}
 }

// class Animal extends Tiger{
//	 public static void main(String[] args) {
//		
//	}
// }
 ///Please refer Tiger1 class...
   class Animal{
	   public static void main(String[] args) {
		Tiger t= Tiger.getTiger("Mahabal");
		t.name="Cheetha";
		Tiger t1=Tiger.getTiger("Bangel");
		
	}
	   
   }
   
   /*
    * But this is not the correct approach because here by calling getters method multiple time 
    * we can create multiple object for that class. So we couldn't get full control over the data we have to create a single ton class.
    * 
    * What is singleTon class?
    * It a another java pattern where a programmer create a private constructor, static getters method and a control statement.
    */
class Antivirus{
	static int count=1;
	static Antivirus a;
	private Antivirus() {
		System.out.println("Welcome to Antivirus Software..");
		System.out.println("Antivirus key is: "+"123$334");
		count++;
	}
	
	public static Antivirus getAntivirus() {
		if(count<=2) {
			a=new Antivirus();
		}
		return a;
	}
}

class AntivirusInstallation{
	public static void main(String[] args) {
		Antivirus a=Antivirus.getAntivirus();
		Antivirus a1=Antivirus.getAntivirus();
		Antivirus a3=Antivirus.getAntivirus();
	}
	
}
//               <-- Encapsulation End -->

class Birds{
	private static String name;
	static int count=1;
	static Birds b;
	 private Birds(String name) {
		System.out.println("Private constructor is Running..");
		this.name=name;
		count++;
	}
	 
	 public static Birds getBirds(String name) {
		 if(count==1) {
			 b=new Birds(name);
		 }
		 return b;
	 }
	 
	 private static int m1() {
		 System.out.println("M1 is running.."+" Bird name is:: "+b.name);
		 return 120;
	 }
	 
	 public int getM1() {
		 return m1();
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setM1(String name) {
		 this.name=name;
	 }
}

class Vulture{
	public static void main(String[] args) {
//		Birds b=new Birds("Paarots");
		Birds b=Birds.getBirds("Koiel");
		b.getM1();
		System.out.println(b.getName());
		b.setM1("Crow");
		System.out.println(b.getName());
		b.getM1();
	}
}