package homeWork;

public class task7 {

	public static void main(String[] args) {
		// ������
		int a = 1;
		int b = 1;

		int c = 2;
		int d = 1;

		int e = 3;
		int f = 2;

		int q = a + c;
		int w = b + d;
		int r = a + d;
		int t = b + c;

		if (q <= e && b <= f && d <= f) {
			System.out.println("��� ���������� �� �������");
		} else if (w <= e && a <= f && c <= f) {
			System.out.println("��� ���������� �� �������");
		} else if (r <= e && b <= f && c <= f) {
			System.out.println("��� ���������� �� �������");
		} else if (t <= e && a <= f && d <= f) {
			System.out.println("��� ���������� �� �������");
		} else
			System.out.println("��� �� ���������� �� �������");
	}

}
