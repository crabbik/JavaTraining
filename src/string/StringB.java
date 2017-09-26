package string;

public class StringB {

	public static void main(String[] args) {

		String str = "Я изучаю Java";
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.append(" и английский тоже надо");
		System.out.println(strBuilder);

	}

}
