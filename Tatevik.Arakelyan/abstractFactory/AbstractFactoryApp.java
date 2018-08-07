package abstractFactory;

/**
 * @author by Tatevik.Arakelyan on 8/7/2018.
 */
public class AbstractFactoryApp {

	public static void main(String[] args) {

		TwixFactory factory = getFactoryBySideOfWand("Right");
		Caramel caramel = factory.getCaramel();
		Chocolate chocolate = factory.getChocolate();

		caramel.kindOfPutOnCaramel();
		chocolate.kindOfPutOnChocolate();

	}

	private static TwixFactory getFactoryBySideOfWand(String side) {
		switch (side) {
			case "Right":
				return new RightWandFactory();
			case "Left":
				return new LeftWandFactory();
			default:
				throw new RuntimeException("Can't get factory for this side:" + side);
		}
	}
}

interface TwixFactory {

	Chocolate getChocolate();

	Caramel getCaramel();
}

class RightWandFactory implements TwixFactory {

	@Override
	public Chocolate getChocolate() {
		return new RightChocolate();
	}

	@Override
	public Caramel getCaramel() {
		return new RightCaramel();
	}
}

class LeftWandFactory implements TwixFactory {

	@Override
	public Chocolate getChocolate() {
		return new LeftChocolate();
	}

	@Override
	public Caramel getCaramel() {
		return new LeftCaramel();
	}
}

interface Chocolate {
	void kindOfPutOnChocolate();
}

interface Caramel {
	void kindOfPutOnCaramel();
}

class RightChocolate implements Chocolate {
	@Override
	public void kindOfPutOnChocolate() {
		System.out.println("Dip a wand into chocolate.");
	}
}

class RightCaramel implements Caramel {

	@Override
	public void kindOfPutOnCaramel() {
		System.out.println("Put a caramel vertically in a wand.");
	}
}

class LeftChocolate implements Chocolate {
	@Override
	public void kindOfPutOnChocolate() {
		System.out.println("Put a chocolate a kind of top to down  in a wand․");
	}
}

class LeftCaramel implements Caramel {

	@Override
	public void kindOfPutOnCaramel() {
		System.out.println("Put a caramel like a waves in a wand.");
	}
}



