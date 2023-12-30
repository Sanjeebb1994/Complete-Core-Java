package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		lh.put(101, "Sanjeeb");
		lh.put(102, "Rajeeb");
		lh.put(103, "Nitu");
		lh.put(104, "Rinku");
		
		System.out.println(lh);
		System.out.println("Get only Key....");
		Set<Integer> s=lh.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		System.out.println("Get only Value...");
		Collection<String> c=lh.values();
		Iterator<String> it1=c.iterator();
		while(it1.hasNext()) {
			String str=it1.next();
			System.out.println(str);
		}
		System.out.println("Get Both Keys and Values...");
		Set<Entry<Integer,String>> e=lh.entrySet();
		Iterator<Entry<Integer,String>> it2=e.iterator();
		while(it2.hasNext()) {
			Object obj=it2.next();
			Map.Entry<Integer, String> m=(Map.Entry<Integer, String>)obj;
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
