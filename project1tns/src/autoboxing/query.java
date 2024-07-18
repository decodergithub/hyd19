package autoboxing;

import java.util.*;
import java.io.*;

public class query {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("hi");
		pq.add("hellow");
		pq.add("bata");
		System.out.println(pq);
		System.out.println(pq.peek());
		// removes the top ones
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());

	}

}
