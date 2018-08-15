package abstractFactoryMethod;

class Welder implements DoorFittingExpert {
	public void getDescription() {
		System.out.println("I can only fit iron doors");
	}
}

