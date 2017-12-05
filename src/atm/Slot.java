package atm;

public class Slot {

	private int nominal;
	private int quantity;

	public Slot(int nominal, int quantity) {
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

	public void addQuantity(int q) {
		this.quantity += q;

	}

	public SlotResult takeMoney(int summ) {
		int q = summ / nominal;

		if (q > this.quantity) {
			q = 0;
		}

		return new SlotResult(this.nominal, q);
	}
}
