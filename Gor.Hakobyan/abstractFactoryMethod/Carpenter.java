package abstractFactoryMethod;

class Carpenter implements DoorFittingExpert {
	public void getDescription() {
		System.out.println("I can only fit wooden doors");
	}
}