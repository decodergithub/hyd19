package autoboxing;

import java.util.*;
import java.io.*;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++)
			ll.add(i);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);

	}

}
