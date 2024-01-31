package arrayList;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
		list.add("gamma");
		// Traversing the list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());
		}
	}
}
