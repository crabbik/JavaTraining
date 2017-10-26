package task12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����:");
		// ������ ������ �� �������
		int v = in.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= v) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
