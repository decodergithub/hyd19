package autoboxing;

import java.util.*;
import java.io.*;

public class demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		for (int i = 0; i <= 5; i++)
			al.add(i);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		for (int i = 0; i <= al.size(); i++)
			System.out.print(al.get(i) + " ");

	}

}
