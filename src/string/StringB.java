package string;

public class StringB {

	public static void main(String[] args) {

		String str = "� ������ Java";
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.append(" � ���������� ���� ����");
		System.out.println(strBuilder);

	}

}
