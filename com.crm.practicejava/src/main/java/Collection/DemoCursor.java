package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DemoCursor {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		
		for(int i=1;i<=10;i++) {
			v.add(i);
		}
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object obj=e.nextElement();
			int i=(int)obj;
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}

class SampleCursor{
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		System.out.println(l);
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			int x=(int)obj;
			if(x%2==0) {
				it.remove();
			}
		}
		System.out.println(l);
	}
}

class TestCursor{
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		ListIterator itr=l.listIterator();
		
		while(itr.hasNext()){
			Object obj=itr.next();
			int x=(int)obj;
			if(x%2==0) {
				itr.remove();
			}
			if(x==3) {
				itr.add(30);
			}
			if(x==9) {
				itr.set(900);
			}
		}
		System.out.println(l);
	}
}

//Fetching data in Reverse order.
class ReverseCursor{
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		ListIterator it=l.listIterator(l.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());//List iterator is bidirectional.
		}
	}
}


