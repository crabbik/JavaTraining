package cycles;

public class Breakcycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 17;
		while (i <= 28) {
			if (i % 13 == 0) {
				break;
			}

			i++;
			System.out.println(i);
		}
		System.out.println(" First number is :" + i);
	}
}
