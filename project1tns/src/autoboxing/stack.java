package autoboxing;

import java.util.*;
import java.io.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("hii");
		stack.push("hellow");
		stack.push("addab");
		stack.push("nanu");
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		stack.pop();
		itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
