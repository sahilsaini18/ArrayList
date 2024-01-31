package arrayList;

import java.util.*;

/**
 * ArrayList uses dynamic array for storing the elements there is no size limit
 * It is like vector in c++
 */
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
//to add elements .add is used
		list.add("Mango");
		list.add("avacardo");
		System.out.println(list);
	}
}