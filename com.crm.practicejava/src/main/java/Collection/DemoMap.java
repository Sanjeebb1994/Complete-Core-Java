package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		//inert data.
		m.put(101, "Raju");
		m.put(102, "Shyam");
		m.put(103, "BabuRao");
		m.put(104, "Totlaseth");
		m.put(105, "Kabira");
		m.put(106, "Anuradha");
		System.out.println(m);
		//get Data
		System.out.println(m.get(106));
		System.out.println(m.get(102));
		//Check Data
		System.out.println(m.containsKey(104));
		System.out.println(m.containsValue("BabuRao"));
		System.out.println(m.isEmpty());
		//Other methods
		System.out.println(m.size());
		//Set operation
		Set<Integer> ks=m.keySet();
		System.out.println(ks);
		Collection<String> ks1=m.values();
		System.out.println(ks1);
		Set ks2=m.entrySet();
		Iterator<Integer> it=ks.iterator();
		while(it.hasNext()) {
			Integer x=it.next();
			System.out.println(x);
		}
		
		Iterator<String> it1=ks1.iterator();
		while(it1.hasNext()) {
			String str=it1.next();
			System.out.println(str);
		}
		
		Iterator it2=ks2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		Set<Entry<Integer, String>> ks3=m.entrySet();
		Iterator<Entry<Integer, String>> it3 =ks3.iterator();
		
		while(it3.hasNext()) {
			Object obj=it3.next();
			System.out.println(obj);
			Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)obj;
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
	}
}
