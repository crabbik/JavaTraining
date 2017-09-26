package string;

public class StringBf {
	public static void main(String[] args) {

		String str = "Я изучаю Java";
		StringBuffer strBuilder = new StringBuffer(str);
		strBuilder.append(" и английский тоже надо");
		System.out.println(strBuilder);
	}
}