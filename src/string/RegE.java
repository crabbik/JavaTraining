package string;

public class RegE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("246".matches("-?[0-9]+"));

		String str = "Test,string,for,split";
		String[] words = str.split(",");
		for (String word : words) {
			System.out.println(word + " ");

		}

	}

}
