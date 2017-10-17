package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Sample {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
	/*	FileOutputStream fos = new FileOutputStream("d:/students/JavaJD1/t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeInt(12345);
		oos.writeObject("Today");
		oos.writeObject(new Date());
		oos.writeObject(new Car("Audi"));
		oos.close();
*/
		FileInputStream fis = new FileInputStream("d:/students/JavaJD1/t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int i = ois.readInt();
		String today = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		Car readCar = (Car) ois.readObject();
		ois.close();
		System.out.println(i);
		System.out.println(today);
		System.out.println(date);
		System.out.println(readCar);

	}

}
