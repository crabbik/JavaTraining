package task12;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) > 5 ? rand.nextInt(10) : -rand
					.nextInt(10);
		}
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 1) {
				k++;

			}

		}
		System.out.println(Arrays.toString(array));
		System.out.println("����� ������ ������� " + k);
	}

}
