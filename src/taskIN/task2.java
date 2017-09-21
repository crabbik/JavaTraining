package taskIN;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {

		int b = 10;
		int[] array = new int[b];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) > 5 ? rand.nextInt(10) : -rand
					.nextInt(10);
		}
		int q = b - 1;
		int[] array2 = new int[q];
		int c = 0;
		boolean isNegativeDetected = false;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0 || isNegativeDetected) {

				array2[c] = array[i];
				c++;
			}

			else {
				isNegativeDetected = true;

			}

		}
		System.out.println(Arrays.toString(array2));

	}
}
