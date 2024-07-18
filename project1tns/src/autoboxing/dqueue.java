package autoboxing;

import java.util.*;

public class dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad);
		ad.clear();
		System.out.println(ad);
		ad.addLast(0);
		ad.add(900);
		ad.add(120);
		ad.add(69);
		ad.addFirst(38);
		System.out.println(ad);

	}

}
