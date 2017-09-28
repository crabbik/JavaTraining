package classSample;

public class Car implements Movable {
	private String carBrand1;

	public String toString() {
		// return "Car [carBrand=" + carBrand + "]";
		return String.format("Carbrand = %s, %s, %s, %s", carBrand1, carBrand1,
				carBrand1, carBrand1);
	}


	public String getCarBrand() {
		return carBrand1;
	}

	public void setCarBrand(String carBrand) {
		if (carBrand1 != null) {
			return;
		}
		this.carBrand1 = carBrand.toUpperCase();

	}

	public void move() {
		System.out.println("I can move");
	}
	public void test(){
		System.out.println("Z");
	}

}
