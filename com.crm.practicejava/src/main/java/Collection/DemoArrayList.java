package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoArrayList {
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add("Sanjeeb");
		l.add('Z');
		l.add(12.34f);
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		System.out.println("Size of ArrayList is: "+l.size());
	}
}

class TestList{
	//Types of Object creation for ArrayList.
	
	public static void main(String[] args) {
		ArrayList l=new ArrayList(500);
		//Here capacity is direct 500.
		//ArrayList a=new ArrayList(Collection c);
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(i);
		}
		
		System.out.println(l.contains(4));
		ArrayList l1=new ArrayList();
		l1.addAll(l);
		System.out.println(l1);
		System.out.println(l1.containsAll(l1));
		l.remove(4);
		System.out.println(l);
		System.out.println(l.size());
		l.clear();
		System.out.println(l.size());
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l1.size());
	}
}