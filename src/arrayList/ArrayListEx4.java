package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * To sort an arraylist, Collection.sort is used. It sorts the array list in
 * ascending order.
 */
public class ArrayListEx4 {
	private static final Logger log = Logger.getLogger(ArrayListEx4.class.getName());

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(43);
		list.add(23);
		list.add(12);
		Collections.sort(list);

		for (int num : list) {
			log.info(String.valueOf(num));
		}
	}
}
