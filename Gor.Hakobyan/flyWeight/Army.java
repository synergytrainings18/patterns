import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gor.Hakobyan on 18-Jul-18.
 */
public class Army {

	Map<Integer, String> type = new HashMap<>();

	public Army() {
		type.put(1, "Automate");
		type.put(2, "Pistol");
	}

	public List<Solder> createArmy() {
		List<Solder> solders = new ArrayList<>();
		for (int i = 1; i < 1000000; i++) {
			Solder solder = new Solder(Program.getGun(type.get((int)(Math.random() * 2 + 1))));
			solders.add(solder);
		}
		return solders;
	}

	public static void main(String[] args) {
		Army army = new Army();
		List<Solder> myArmy = army.createArmy();
		System.out.println(myArmy.get(0).gun.type);
		System.out.println(myArmy.get(5).gun.type);
		System.out.println(myArmy.get(18).gun.type);
		System.out.println(myArmy.get(80).gun.type);
		System.out.println(myArmy.get(158).gun.type);
		System.out.println(myArmy.get(88).gun.type);
		System.out.println(myArmy.get(28528).gun.type);
		System.out.println(myArmy.get(898696).gun.type);
	}
}
