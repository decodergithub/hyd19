package autoboxing;

import java.util.*;
import java.io.*;

//program for why collection of frame work needed
public class Main {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5 };
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		v.addElement(1);
		v.addElement(2);
		h.put(1, "greeks");
		h.put(2, "4greeks");
		System.out.println(array[4]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		System.out.println(h.get(2));

	}

}
