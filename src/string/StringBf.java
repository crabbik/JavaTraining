package string;

public class StringBf {
	public static void main(String[] args) {

		String str = "� ������ Java";
		StringBuffer strBuilder = new StringBuffer(str);
		strBuilder.append(" � ���������� ���� ����");
		System.out.println(strBuilder);
	}
}