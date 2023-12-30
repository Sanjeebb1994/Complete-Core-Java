package Collection;

import java.util.Stack;

public class DemoStack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("Sanjeeb");
		s.add(12.34f);
		s.add('E');
		s.add(20);
		s.add(20);
		s.add(true);
		s.add(null);
		s.add(445);
		System.out.println("Length of stack is:: "+s.size());
		System.out.println(s);
		System.out.println(s.contains('E'));
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s);
		Stack s1=new Stack();
		for(int i=5;i<=25;i+=5) {
			s1.add(i);
		}
		System.out.println(s1);
		System.out.println(s1.search(15));
		System.out.println(s1.search(25));
	}
}

class TestStack{
	public static void main(String[] args) {
		Stack st=new Stack();
		for(int i=1;i<=10;i++) {
			st.add(i);
		}
		
		System.out.println(st);
		
		for(int i=1;i<=st.size();i++) {
			System.out.println(i);
		}
	}
}
