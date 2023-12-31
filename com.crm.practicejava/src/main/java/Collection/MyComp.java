package Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i=(Integer)obj1;
		Integer j=(Integer)obj2;
		
		return i.compareTo(j);
	}
	
	public static void main(String[] args) {
		
	}

}

class TestTs{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComp());
		
		ts.add(20);
		ts.add(30);
		ts.add(400);
		ts.add(5);
		ts.add(60);
		
		System.out.println(ts);
	}
}

class StudentByAscRollNum implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i=(Integer)obj1;
		Integer j=(Integer)obj2;
		return i.compareTo(j);
	}
}

class StudentsByDescRollNum implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i=(Integer)obj1;
		Integer j=(Integer)obj2;
		return -i.compareTo(j);
	}
}


class SampleTS{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new StudentByAscRollNum());
		ts.add(20);
		ts.add(10);
		ts.add(80);
		ts.add(70);
		ts.add(40);
		
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet(new StudentsByDescRollNum());
		ts1.add(20);
		ts1.add(10);
		ts1.add(80);
		ts1.add(70);
		ts1.add(40);
		
		System.out.println(ts1);
		
		TreeSet ts2=new TreeSet(new StudentByAscRollNum());
		ts2.add(new Persions("Sanjeeb", 29));
		ts2.add(new Persions("Rajib", 21));
		ts2.add(new Persions("Nitu", 23));
		ts2.add(new Persions("Rinku", 15));
		
		System.out.println(ts2);
				
	}
}

class Persions{
	String name;
	int age;
	
	public Persions(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Persion Name: "+name+" & Age:: "+age+"\n";
	}
}

class SampleLabour{
	
	String name;
	int sal;
	
	public SampleLabour(String name, int sal) {
		this.name=name;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		return "Labour Name: "+name+" & Salary: "+sal+"\n";
	}
	
	
}

class ShortByName implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		SampleLabour s1=(SampleLabour)obj1;
		SampleLabour s2=(SampleLabour)obj2;
		return s1.name.compareTo(s2.name);
	}
}

class ShortBySalary implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		SampleLabour s1=(SampleLabour)obj1;
		SampleLabour s2=(SampleLabour)obj2;
		
		if(s1.sal==s2.sal) {
			return 0;
		}else if(s1.sal>s2.sal){
			return 1;
		}else {
			return -1;
		}
	}
}

class TestLabour{
	public static void main(String[] args) {
		
		System.out.println("Short By Name:: ");
		TreeSet ts=new TreeSet(new ShortByName());
		
		ts.add(new SampleLabour("Sanjeeb", 1200));
		ts.add(new SampleLabour("Rajeeb", 1100));
		ts.add(new SampleLabour("Jems", 1500));
		ts.add(new SampleLabour("Scott", 1400));
		System.out.println(ts);
		
		System.out.println("Short By Salaray:: ");
		TreeSet ts1=new TreeSet(new ShortBySalary());
		
		ts1.add(new SampleLabour("Sanjeeb", 1200));
		ts1.add(new SampleLabour("Rajeeb", 1100));
		ts1.add(new SampleLabour("Jems", 1500));
		ts1.add(new SampleLabour("Scott", 1400));
		System.out.println(ts1);
	}
}
