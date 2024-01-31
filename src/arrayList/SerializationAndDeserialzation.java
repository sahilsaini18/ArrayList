package arrayList;
import java.io.*;
import java.util.*;


/**
 * Arraylist Serialization and Deserialization
 * using FileOutputStream the input file is given 
 * using the ObjectOutputStream it is converted into object and is available to write in it
 * 
 * In Deserialization bytestream is converted back to object
 * ois.readObject() reads the byte stream and convert it into ArrayList
 */
public class SerializationAndDeserialzation {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Rajesh");
	list.add("abhilash");
	list.add("nost");
	
	try {
		//serialization
		FileOutputStream fos= new FileOutputStream("file");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		fos.close();
		oos.close();
		
		//deserialization
		FileInputStream fis = new FileInputStream("file");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ArrayList al = (ArrayList)ois.readObject();
		System.out.println(al);
		ois.close();
		fis.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	
	}
}
}
