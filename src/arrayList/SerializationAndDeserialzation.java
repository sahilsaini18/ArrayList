package arrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * ArrayList Serialization and Deserialization Using FileOutputStream, the input
 * file is given Using ObjectOutputStream, it is converted into an object and is
 * available to write in it
 * 
 * In Deserialization, byte stream is converted back to object ois.readObject()
 * reads the byte stream and converts it into ArrayList
 */
public class SerializationAndDeserialization {
	private static final Logger log = Logger.getLogger(SerializationAndDeserialization.class.getName());

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rajesh");
		list.add("Abhilash");
		list.add("Nost");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();

			// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<?> deserializedList = (ArrayList<?>) ois.readObject();
			log.info(deserializedList.toString());
			ois.close();
			fis.close();
		} catch (Exception e) {
			log.warning(e.toString());
		}
	}
}
