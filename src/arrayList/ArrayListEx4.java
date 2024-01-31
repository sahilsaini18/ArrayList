package arrayList;
import java.util.*;
/**
 * To sort an arraylist collection.sort is used
 * it sorts the array list in ascending order
 */
public class ArrayListEx4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(43);
		list.add(23);
		list.add(12);
		Collections.sort(list);
		for(int num:list) {
			System.out.println(num);
		}
		
	}
}
