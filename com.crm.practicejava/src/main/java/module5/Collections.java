package module5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collections {
	/*
	 *          <-- Collection Framework -->
	 *  What is collection?
	 *  collection is a single entity which represent multiple object.
	 *  Ex: Student collection is a single entity which represent group of student.
	 *  
	 *  What is a collection framework?
	 *  To represent group of object into a single entity we need set of classes and interface
	 *  so, collection framework provide us those classes and interfaces.
	 *  
	 *  But still one question will arise that is> If we have Array to store multiple data in a
	 *  single object then why should we go for collection.
	 *  
	 *  But before that let's see what are the disadvantages with array.
	 *  1. Array can store homogeneous data type that means only one type of data.
	 *  2. It is not autogrowable in nature. That means the size of an Array is fix we can't be
	 *  increase or decrease the size of array.
	 *  3. Array is not support underline data structure.
	 *  That means we can't be create our own redeemed method.
	 *    
	 */
	public static void main(String[] args) {
		int [] a=new int[10];// 10 memory create at a time inside the memory.
//		a[0]=10;
//		System.out.println(a[0]);
		int n=101;
		for(int i=0;i<a.length;i++) {
			a[i]=n;
			n++;
		}
		
		for(int x : a) {
			System.out.println(x);
		}
		//But here we can push only same data type and to overcome this problem we can refer an object class.
		
		Object[] obj=new Object[5];
		obj[0]=1;
		obj[1]="Ram";
		obj[2]='B';
		obj[3]=45;
		obj[4]=5.6f;
		for(Object o:obj) {
			System.out.println(o);
		}
		//But here the problem is we can't be modify the size of the array.
		// Due to this issue we are looking towards Collection Framework.
	}

}

//ArrayList:
class DemoList{
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		System.out.println(l.size());
		//Insert Data.
		int i=10;
		l.add(i);
		l.add(12.34);
		l.add("String");
		l.add('V');
		l.add(true);
		l.add(null);
		l.add(89376398763L);
		l.add(123);
		l.add(false);
		l.add('V');
		l.add("Sanjeeb");
		System.out.println(l.size());
		System.out.println(l);
		//Search Data.
	   System.out.println(l.contains("String"));
	   System.out.println(l.contains(123));
	   System.out.println(l.isEmpty());
	   //Remove Data.
	   l.remove(i);
	   System.out.println(l.size());
	   l.clear();
	   System.out.println(l.size());
		
	}
}
//How make copy of an array list.
class SampleList{
	public static void main(String[] args) {
		ArrayList l=new ArrayList(20);
		for(int i=1;i<=20;i++) {
			l.add(i);
		}
		System.out.println(l.size());
		System.out.println(l);
		
		
		ArrayList l1=new ArrayList();
		//l1.add(l);
		l1.addAll(l);
		System.out.println(l1);
		for(int i=1;i<=20;i++) {
			l1.add(i);
		}
		System.out.println(l1);
		//l1.remove(l);
		l1.removeAll(l);
		System.out.println(l1);
	}
}
//vector
class TestList{
	public static void main(String[] args) {
		Vector v=new Vector(20);
		float f=34.5f;
//		Insert Data
		v.add(23);
		v.add(f);
		v.add('S');
		v.add("Sanjeeb");
		v.add(null);
		
		System.out.println(v);
		//Search Data
		System.out.println(v.contains(23));
		System.out.println(v.isEmpty());
		//Delete data;
		v.remove(3);
		v.remove(f);
		System.out.println(v);
		v.clear();
		System.out.println(v);
		
	}
}
//How to Make a copy of vector list.
class DemoTest{
	public static void main(String[] args) {
		Vector v=new Vector(10);
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		
		System.out.println(v);
		
		Vector v1=new Vector();
		v1.addAll(v);
		System.out.println(v1);
		System.out.println(v1.containsAll(v));
		v1.removeAll(v);
		System.out.println(v1);
	}
}

//Stack
class DemoLink1{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(23);
		s.add("Sanjeeb");
		s.push(45.66f);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}

class DemoLink2{
	public static void main(String[] args) {
		Stack s=new Stack();
		
		for(int i=5;i<=25;i++) {
			s.push(i);
		}
		System.out.println(s);
		
		System.out.println(s.search(5));//Work in LIFO principle.
		System.out.println(s.search(25));
	}
}

class SampleLInk1{
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(5);
		l.add(1, 23);
		l.add(55.67f);
		l.add('A');
		l.add("Sanjeeb");
		System.out.println(l);
		System.out.println(l.get(3));
		l.remove(2);
		System.out.println(l);
		l.set(2, "Rajeeb");
		System.out.println(l);
		l.add(23);
		System.out.println(l.indexOf("Rajeeb"));
		System.out.println(l.lastIndexOf(23));
		System.out.println(l);
	}
}