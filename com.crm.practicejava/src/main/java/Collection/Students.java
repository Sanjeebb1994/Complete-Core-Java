package Collection;

import java.util.TreeSet;

public class Students implements Comparable{
	
	String name;
	int rollNum;
	public Students(String name,int rollNum) {
		this.name=name;
		this.rollNum=rollNum;
	}
	
	@Override
	public String toString() {
		return "Student Name: "+name+" & RollNumber: "+rollNum+"\n";
	}
	
	@Override
	public int compareTo(Object obj) {
		Students s1=this;
		Students s2=(Students)obj;
		if(s1.rollNum<s2.rollNum) {
			return -1;
		}else if(s1.rollNum>s2.rollNum) {
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		
	}
}

class DemoTs{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Students("Raja", 25));
		ts.add(new Students("Rani", 1));
		ts.add(new Students("Politician", 420));
		ts.add(new Students("Sipahi", 88));
		
		System.out.println(ts);
	}
}

class Student implements Comparable{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" & Age:: "+age+"\n";
	}
	
	@Override
	public int compareTo(Object obj) {
		Student s1=this;
		Student s2=(Student)obj;
	
		Integer i=s1.age;
		Integer j=s2.age;  
		return i.compareTo(j);
	}
}

class TestStudent{
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new Student("Sanjeeb", 29));
		t.add(new Student("Rajib", 23));
		t.add(new Student("Nitu", 25));
		t.add(new Student("Rinku", 15));
		
		System.out.println(t);
	}
}


class SampleEmployee implements Comparable{
	
	String name;
	int regNo;
	
	SampleEmployee(String name, int regNo){
		this.name=name;
		this.regNo=regNo;
	}
	
	@Override
	public String toString() {
		return "Employee Name: "+name+" & RegNO: "+regNo+"\n";
	}
	
	@Override
	public int  compareTo(Object obj) {
		SampleEmployee t1=this;
		SampleEmployee t2=(SampleEmployee)obj;
		
		String i=t1.name;
		String j=t2.name;
		
		return i.compareTo(j);
	}
}

class TestEmployee{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new SampleEmployee("Sanjeeb", 7762));
		ts.add(new SampleEmployee("Rajeeb", 3738));
		ts.add(new SampleEmployee("Jems", 4474));
		
		System.out.println(ts);
	}
}

