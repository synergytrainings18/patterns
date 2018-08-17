
import impl.SportsCarFactory;
import interfaces.SportsCar;
import util.CarsUtil;

import java.util.List;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class FactoryMethodApp {
	public static void main(String[] args) {
		List<SportsCar> sportsCar = CarsUtil.createCars(new SportsCarFactory(), "Bugatti", 10);
		sportsCar.get(0).carsMark();
	}
}
