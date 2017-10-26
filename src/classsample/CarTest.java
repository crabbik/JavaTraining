package classsample;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCarBrand("Bmw");
		car.setCarBrand("Audi");
		System.out.println(car);
		car.move();
		Car passengerCar = new PassengerCar();
		Truck truck = new Truck();
		passengerCar.setCarBrand("Seat");
		truck.setCarBrand("Volvo");
		passengerCar.move();
		truck.move();

	}

}
