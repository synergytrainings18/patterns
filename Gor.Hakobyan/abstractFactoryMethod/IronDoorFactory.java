package abstractFactoryMethod;

public class IronDoorFactory implements DoorFactory {
	public Door makeDoor() {
		return new IronDoor();
	}

	public DoorFittingExpert makeFittingExpert() {
		return new Welder();
	}
}