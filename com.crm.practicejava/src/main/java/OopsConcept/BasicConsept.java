package OopsConcept;

public class BasicConsept {
	int x=23;
	BasicConsept(int x){
		System.out.println(x);
		this.x=x;
	}
	
	public static void main(String[] args) {
		BasicConsept bc=new BasicConsept(123);
		System.out.println(bc.x);
		bc.x=45;
		System.out.println(bc.x);
		BasicConsept bc1=new BasicConsept(321);
		System.out.println(bc1.x);
	}
}

class Employee{
	String eName;
	int eRegNo;
	char eBloodGroup;
	
	Employee(String name, int regNo, char bloodGroup){
		this.eName=name;
		this.eRegNo=regNo;
		this.eBloodGroup=bloodGroup;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("Biswajit", 321453, 'B');
		System.out.println(e1.eName);
		System.out.println(e1.eRegNo);
		System.out.println(e1.eBloodGroup);
		System.out.println("--------------------------------------------");
		Employee e2=new Employee("Sanjeeb", 98976, 'A');
		System.out.println(e2.eName);
		System.out.println(e2.eRegNo);
		System.out.println(e2.eBloodGroup);
	}
	
}