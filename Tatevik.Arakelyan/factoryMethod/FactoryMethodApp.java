package factoryMethod;

/**
 * @author by Tatevik.Arakelyan on 8/7/2018.
 */
public class FactoryMethodApp {
	public static void main(String[] args) {

		//CarMaker maker = new SportsCarMaker(); // new TrucksCarMaker()

		CarMaker maker = getMakerByName("TrucksCar");
		Car car = maker.createCar();
		car.carsMark();
	}

	public static CarMaker getMakerByName(String maker) {
		switch (maker) {
			case "SportsCar":
				return new SportsCarMaker();
			case "TrucksCar":
				return new TrucksCarMaker();
			default:
				throw new RuntimeException("Incorrect mark of a car" + maker);
		}
	}
}

interface Car {
	void carsMark();
}

class SportsCar implements Car {
	@Override
	public void carsMark() {
		System.out.println("It's a sports car");
	}
}

class TrucksCar implements Car {
	@Override
	public void carsMark() {
		System.out.println("It's a truck car");
	}
}

interface CarMaker {
	Car createCar();
}

class SportsCarMaker implements CarMaker {

	@Override
	public Car createCar() {
		return new SportsCar();
	}
}

class TrucksCarMaker implements CarMaker {

	@Override
	public Car createCar() {
		return new TrucksCar();
	}
}
