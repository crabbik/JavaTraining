package string;

public class EnumSamples {

	public static void main(String[] args) {
		TransactionStatus opened = TransactionStatus.opened;

		System.out.println(opened.ordinal());
		System.out.println(opened.name());

		TransactionStatus closed = TransactionStatus.valueOf("closed");
		System.out.println(closed.getNameRu());
		System.out.println(TransactionStatus.values()[1]);

	}

}
