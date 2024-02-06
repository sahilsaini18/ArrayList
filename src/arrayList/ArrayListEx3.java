package arrayList;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayListEx3 {
	private static final Logger log = Logger.getLogger(ArrayListEx3.class.getName());

	/**
	 * @param args Iterating in the array list using for each loop
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("apple");

		for (String a : list) {
			log.info(a);
		}
	}
}
