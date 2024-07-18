package autoboxing;

import java.util.*;
import java.io.*;

public class hashset {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "hi");
		hm.put(2, "hi");
		hm.put(3, "ho");
		hm.put(4, "ho");
		hm.put(5, "bathobasi");
		hm.put(6, "mokamila");
		hm.put(7, "bathobasi");
		System.out.println(hm);
		System.out.println(hm.get(2));

	}

}
