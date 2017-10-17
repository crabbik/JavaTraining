package pack1;

public class Page {

	@SuppressWarnings("unused")
	public Page() {
		super();
		AbstractButton button1 = new AbstractButton(){

			@Override
			public void onClick() {
				System.out.println("OK");

			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
		};
		AbstractButton button2 = new AbstractButton() {

			@Override
			public void onClick() {
				System.out.println("SAVE");
			}
		};
	}

}
