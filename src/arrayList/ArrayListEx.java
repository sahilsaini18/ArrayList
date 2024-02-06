package arrayList;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * ArrayList uses a dynamic array for storing the elements; there is no size
 * limit. It is like a vector in C++.
 */
public class ArrayListEx {
	private static final Logger log = Logger.getLogger(ArrayListEx.class.getName());

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// To add elements, .add() is used
		list.add("Mango");
		list.add("Avocado");

		log.info(list.toString());
	}
}
