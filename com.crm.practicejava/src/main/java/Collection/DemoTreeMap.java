package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(15, "Hello");
		tm.put(45, "Kumar");
		tm.put(25, "Sayali");
		tm.put(35, "Pavan");
		tm.put(20, "Sujeer");
		System.out.println(tm);
		System.out.println("Print Keys only.....");
		Set<Integer> k=tm.keySet();
		Iterator<Integer> it1=k.iterator();
		while(it1.hasNext()) {
			Integer i=it1.next();
			System.out.println(i);
		}
		System.out.println("Print Values only....");
		Collection<String> c=tm.values();
		Iterator<String> it2=c.iterator();
		while(it2.hasNext()) {
			String str=it2.next();
			System.out.println(str);
		}
		System.out.println("Print both Keys and Values as well.....");
		Set<Entry<Integer, String>> e=tm.entrySet();
		Iterator<Entry<Integer, String>> it3=e.iterator();
		while(it3.hasNext()) {
			Object obj=it3.next();
			Map.Entry<Integer, String> m=(Map.Entry<Integer, String>)obj;
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}

}

class DemoHouse{
	String name;
	int hight;
	float length;
	float width;
	char block;
	
	public DemoHouse(String name,int hight,float length,float width,char block) {
		this.name=name;
		this.hight=hight;
		this.width=width;
		this.length=length;
		this.block=block;
	}
	
	@Override
	public String toString() {
		return "House Name:: "+name+"\t"+"Hight:: "+hight+"\t"+"Width:: "+width+"\t"+"Length:: "+length+"\t"+"Block Name: "+block+"\n";
	}
}

class TestHome{
	public static void main(String[] args) {
		TreeMap<Integer, DemoHouse> map=new TreeMap<Integer, DemoHouse>();
		DemoHouse dh1=new DemoHouse("Sanjeeb", 234, 56.56f, 50.34f, 'B');
		DemoHouse dh2=new DemoHouse("Rajeeb", 345, 56.98f, 55.98f, 'A');
		DemoHouse dh3=new DemoHouse("Ranita", 554, 76.99f, 80.88f, 'C');
		DemoHouse dh4=new DemoHouse("Ankita", 337, 88.78f, 80.77f, 'D');
		
		map.put(1, dh1);
		map.put(2, dh2);
		map.put(3, dh3);
		map.put(4, dh4);
		System.out.println(map);
		System.out.println("==================================================");
		for(Map.Entry<Integer, DemoHouse> m:map.entrySet()) {
			Integer key=m.getKey();
			DemoHouse ts=m.getValue();
			System.out.println(key+"Details: ");
			System.out.println(ts.name+"\t"+ts.hight+"\t"+ts.width+"\t"+ts.hight+"\t"+ts.block);
		}
		
		
		
				
	}
}




