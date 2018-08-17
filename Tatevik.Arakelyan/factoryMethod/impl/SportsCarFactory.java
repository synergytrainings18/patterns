package impl;

import interfaces.CarFactory;
import interfaces.SportsCar;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class SportsCarFactory implements CarFactory{
	@Override
	public SportsCar createCar(String carMark) {
		switch (carMark) {
			case "Bugatti":
				return new Bugatti();
			case "Ferrari":
				return new Ferrari();
			default:
				throw new RuntimeException("Incorrect mark of a car" + carMark);
		}
	}
}
