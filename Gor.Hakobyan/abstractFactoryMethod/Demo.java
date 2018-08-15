package abstractFactoryMethod;

/**
 * @author Gor.Hakobyan on 15-Aug-18.
 */
public class Demo {

	public static void main(String[] args) {
		DoorFactory woodenFactory = new WoodenDoorFactory();

		Door door = woodenFactory.makeDoor();
		DoorFittingExpert expert = woodenFactory.makeFittingExpert();

		door.getDescription();
		expert.getDescription();

		DoorFactory ironFactory = new IronDoorFactory();

		door = ironFactory.makeDoor();
		expert = ironFactory.makeFittingExpert();

		door.getDescription();
		expert.getDescription();
	}
}