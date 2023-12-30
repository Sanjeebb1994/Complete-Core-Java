package Collection;

import java.util.Vector;

public class DemoVectorList {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("Sanjeeb");
		v.add(10);
		v.add(23.768f);
		v.add('B');
		v.add(null);
		v.add(true);
		
		System.out.println("Size of vector list is:: "+v.size());
		System.out.println(v);
		
		Vector v1=new Vector();
		v1.addAll(v);
		System.out.println(v1.size());
		System.out.println(v1);
		
		for(int x=0;x<=10;x++) {
			v1.add(x);
		}
		
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println(v1.contains(5));
		System.out.println(v1.containsAll(v));
		v.remove(5);
		System.out.println(v);
		v1.removeAll(v);
		System.out.println(v1.isEmpty());
		System.out.println(v1);
		
	}
}
