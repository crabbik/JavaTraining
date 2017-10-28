package patterns;

public class Invoker {

	public static void main(String[] args) {

		Command command = null;
		int n = 1;
		if (n == 1) {
			command = new MonCommand();
		} else if (n == 2) {
			command = new TuCommand();
		}
		command.execute();
	}

}
