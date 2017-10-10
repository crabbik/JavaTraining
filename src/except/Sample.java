package except;

public class Sample {

	public static void main(String[] args) {
		method1();

	}

	public static void method1() {
		try {
			method2();
			System.out.println("Я изучаю Exception");
			return;
		} catch (MyException e) {
			System.out.println("Поймали Exception");
		}
		/*
		 * finally { System.out.println("Выполнить всегда.Почти"); }
		 */
		System.out.println("Я добросовестный студент");
	}

	public static void method2() throws MyException {
		method3();
	}

	public static void method3() throws MyException {
		int size = 1;
		if (size == 0) {
			MyException myExcnew = new MyException();
			throw myExcnew;

		}
	}

}
