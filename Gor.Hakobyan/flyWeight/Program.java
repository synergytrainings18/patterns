import java.util.HashMap;
import java.util.Map;

/**
 * @author Gor.Hakobyan on 18-Jul-18.
 */
public class Program {

	private Program() {
	}

	private static Map<String, Gun> cache = new HashMap<>();

	public static Gun getGun(String type) {
		if (cache.containsKey(type))
			return cache.get(type);
		Gun gun;
		switch (type) {
			case "Automate":
				gun = new Automate();
				break;
			case "Gun":
				gun = new Pistol();
				break;
			default:
				gun = new Gun();
		}
		cache.put(type, gun);
		return gun;
	}
}
