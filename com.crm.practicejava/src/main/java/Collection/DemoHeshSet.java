package Collection;

import java.util.HashSet;

public class DemoHeshSet {
	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(23.347f);
		hs.add(653);
		hs.add(null);
		hs.add("Sanjeeb");
		hs.add(653);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
	}

}


