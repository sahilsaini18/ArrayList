package arrayList;

import java.util.*;

public class ArrayListEx3 {
	/**
	 * @param args
	 *  Iterating in the array list using for each loop
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("apple");
		for (String a : list) {
			System.out.println(a);
		}
	}
}
