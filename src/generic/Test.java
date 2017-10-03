package generic;

public class Test {

	public static void main(String[] args) {

		Box<Integer, String> box = new Box<Integer, String>();
		box.setItem1(5);
		box.setItem2("Успех");
		Box<Integer, String> box1 = new Box<Integer, String>();
		box1.setItem2("Успех");

		System.out.println(box.getItem1());
	}

}
