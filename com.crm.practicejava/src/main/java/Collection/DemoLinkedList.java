package Collection;

import java.util.Collection;
import java.util.LinkedList;

public class DemoLinkedList {
	
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add("Hi");
		l.add("Bye");
		l.add("Hi");
		l.add(123);
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(24);
		l1.add(25);
		l1.add(26);
		l1.add(27);
		
		System.out.println(l1);
		l1.add(3, 34);
		System.out.println(l1);
		System.out.println(l1.get(4));
		l1.remove(2);
		System.out.println(l1);
		l1.set(4, "Hello");
		System.out.println(l1);
		System.out.println(l1.indexOf(34));
		l1.add(34);
		System.out.println(l1);
		System.out.println(l1.indexOf(34));
		System.out.println(l1.lastIndexOf(34));
		
	}

}
