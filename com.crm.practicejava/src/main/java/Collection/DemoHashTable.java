package Collection;

import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(1, "Sanjeeb");
		ht.put(2, "Shyam");
		ht.put(3, "Rajeeb");
		ht.put(4, "Raju");
		System.out.println(ht);
		
		for(Map.Entry<Integer, String> m:ht.entrySet()) {
			Integer i=m.getKey();
			String s=m.getValue();
			System.out.println(i+"\t"+s);
		}
		
	}
}
