package homeWork;

public class Task21No {

	public static void main(String[] args) {
		// ��� �������� �������� ����������?
		String str0 = "������ ����";
		String str1 = "������ ���";
		StringBuilder strBuilder = new StringBuilder(str1);

		for (int i = 0; i <= 3; i++) {
			str0 += " ����������� ������";

		}
		System.out.println(str0);

		for (int i = 0; i <= 3; i++) {

			strBuilder.append(" ����������� ������");

		}
		System.out.println(strBuilder);

	}

}
