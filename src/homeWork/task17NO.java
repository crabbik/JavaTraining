package homeWork;

public class task17NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 4;
		int r = c;
		int m[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m[i][j] = 0;
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; i++) {
				m[i][j] = 1;
			}
		}
	}

}
