package atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ATM {

	private List<Slot> slots = new ArrayList<>();

	public ATM(List<Slot> slots) {
		super();
		this.slots = slots;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public boolean cacheOut(int summ) {

		ArrayList<SlotResult> results = new ArrayList<>();
		for (Slot slot : slots) {
			SlotResult slotResult = slot.takeMoney(summ);
			results.add(slotResult);
			summ -= slotResult.getNominal() * slotResult.getQuantity();
		}

		if (summ == 0) {
			for (SlotResult slotResult : results) {
				for (Slot slot : slots) {
					if (slotResult.getNominal() == slot.getNominal()) {
// TODO remove money
					}
				}

			}

			System.out.println("Success:" + Arrays.toString(results.toArray()));

			return true;
		} else {
			System.out.println("Fail. can't execute operation");
			return false;
		}

	}

}
