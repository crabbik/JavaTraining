
public class man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 864000;
		int sec = s % 60;
		int m = (s - sec) / 60;
		int min = m % 60;
		int h = (m - min) / 60;
		int hr = h % 24;
		int d = (h - hr) / 24;
		int day = d % 7;
		int w = (d - day) / 7;
		System.out.println(w + " недель " + day + " дней " + hr + " часов " + min + " минут " + sec + " секунд ");
	}

}
