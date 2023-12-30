package Collection;

import java.util.TreeSet;

public class DemoTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add(12);
		ts.add(34);
		ts.add(55);
		ts.add(12);
		//ts.add("Sanjeeb");
		ts.add(5);
		//ts.add(null);
		
		System.out.println(ts);
	}

}


class TestTreeSet{
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		t.add('E');
		t.add('X');
		t.add('R');
		t.add('U');
		t.add('O');
		t.add('S');
		
		System.out.println(t);
		/*t.add(new StringBuffer('E'));
		t.add(new StringBuffer('X'));
		t.add(new StringBuffer('R'));
		t.add(new StringBuffer('U'));
		t.add(new StringBuffer('O'));
		t.add(new StringBuffer('S'));
		System.out.println(t);*/
		
	}
}

