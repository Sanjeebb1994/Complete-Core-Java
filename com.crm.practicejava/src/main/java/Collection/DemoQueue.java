package Collection;

import java.util.PriorityQueue;

public class DemoQueue {
	
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(12);
		//pq.add("Sanjeeb");
		pq.add(3);
		pq.add(12);
		pq.add(45);
		pq.add(56);
		//pq.add(null);
		pq.add(12);
		System.out.println(pq);
		System.out.println("Use peek method...");
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println("Use poll method...");
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("Use remove method...");
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println("Use element method...");
		System.out.println(pq.element());
		System.out.println(pq);
	}
}
