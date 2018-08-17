package util;

import interfaces.CarFactory;
import interfaces.SportsCar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class CarsUtil {
	public static List<SportsCar> createCars(CarFactory factory, String mark, int count) {
		List<SportsCar> sportsCar = new ArrayList<>();
		for (int i = 0; i < count; ++i) {
			sportsCar.add(factory.createCar(mark));
		}
		return sportsCar;
	}
}
