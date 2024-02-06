package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class ArrayListEx2 {
	private static final Logger log = Logger.getLogger(ArrayListEx2.class.getName());

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
		list.add("gamma");

		// Traversing the list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {// check if iterator has the elements
			log.info(itr.next());
		}
	}
}
