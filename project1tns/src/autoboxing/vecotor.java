package autoboxing;

import java.util.*;
import java.io.*;

public class vecotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i <= 5; i++)
			v.add(i);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		for (int i = 0; i <= 5; i++)
			System.out.print(v.get(i) + "   ");

	}

}
