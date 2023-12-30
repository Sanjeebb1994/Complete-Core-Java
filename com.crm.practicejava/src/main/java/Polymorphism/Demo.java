package Polymorphism;

public class Demo {
	//Compile time Polymorphism
	//Method Over loading
	public void m1() {
		System.out.println("m1 method is running....");
	}
	
	public void m1(int x) {
		System.out.println("m1 running with int argument...");
	}
	
	public void m1(int x, String name) {
		System.out.println("m1 running with int and String arguments...");
	}
	
	public void m1(String name, int x) {
		System.out.println("m1 is running with String and int arguments");
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		d.m1(123);
		d.m1(123, "Sanjeeb");
		d.m1("Sanjeeb", 123);
	}
	

}

class BankSearch{
	public void search(long accountNumber) {
		System.out.println("Account is searching by using acount Number");
	}
	
	public void search(String name, long accountNumber) {
		System.out.println("Account is searching by using Name and Number");
	}
	
	public void search(long accountNumber, long mobileNumber) {
		System.out.println("Account is searcing by uding accountNumber and mobleNumber");
	}
	
	public static void main(String[] args) {
		BankSearch bs=new BankSearch();
		bs.search(202212146692l);
		bs.search("Sanjeeb", 20210614499L);
		bs.search(20212624499L, 8984263538l);
	}
}

 
