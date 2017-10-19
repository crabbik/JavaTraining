package atm;

public class SlotResult {
	
	private int nominal;
	
	private int quantity;

	public SlotResult(int nominal, int quantity) {
		super();
		this.nominal = nominal;
		this.quantity = quantity;
	}

	public int getNominal() {
		return nominal;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "SlotResult [nominal=" + nominal + ", quantity=" + quantity + "]";
	}
	

}
