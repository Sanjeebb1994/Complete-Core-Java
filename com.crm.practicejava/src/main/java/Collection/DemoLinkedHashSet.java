package Collection;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
	
	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(12);
		ls.add("Sanjeeb");
		ls.add('O');
		ls.add(34.7677f);
		ls.add(null);
		ls.add(12);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);
	}
}
