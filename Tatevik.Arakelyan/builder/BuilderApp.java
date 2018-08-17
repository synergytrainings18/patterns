package builder;

/**
 * @author by Tatevik.Arakelyan on 8/17/2018.
 */
public class BuilderApp {
	public static void main(String[] args) {
		Director director = new Director();
		director.setPhoneBuilder(new SamsungBuilder());
		Phone phone = director.BuildPhone();
		System.out.println(phone);

	}
}

enum OperatingSystem {
	iOS, ANDROID
}

// Product
class Phone {
	String make;
	int maxCash;
	OperatingSystem operatingSystem;

	public void setMake(String make){this.make = make;}
	public void setMaxCash(int maxCash){this.maxCash = maxCash;}
	public void setOperatingSystem(OperatingSystem operatingSystem){this.operatingSystem = operatingSystem;}


	@Override
	public String toString(){
		return "Car : make = " + make + ", maxCash = " + maxCash + ", operatingSystem = " + operatingSystem;
	}
}

// Abstract Builder
abstract class PhoneBuilder{
	Phone phone;
	void createPhone(){phone = new Phone();}

	abstract void buildMake();
	abstract void buildMaxCash();
	abstract void buildOperatingSystem();

	Phone getPhone(){return phone;}
}

//Concrete Builder
class IPhoneBuilder extends PhoneBuilder{

	@Override
	void buildMake() {
		phone.setMake("iPhone");
	}

	@Override
	void buildMaxCash() {
		phone.setMaxCash(1500);
	}

	@Override
	void buildOperatingSystem() {
		phone.setOperatingSystem(OperatingSystem.iOS);
	}
}

//COncrete Builder
class SamsungBuilder extends PhoneBuilder{

	@Override
	void buildMake() {
		phone.setMake("Samsung");
	}

	@Override
	void buildMaxCash() {
		phone.setMaxCash(2000);
	}

	@Override
	void buildOperatingSystem() {
		phone.setOperatingSystem(OperatingSystem.ANDROID);
	}
}

// Director
class Director{
	PhoneBuilder phoneBuilder;
	void setPhoneBuilder(PhoneBuilder phoneBuilder){this.phoneBuilder = phoneBuilder;}

	Phone BuildPhone(){
		phoneBuilder.createPhone();
		phoneBuilder.buildMake();
		phoneBuilder.buildMaxCash();
		phoneBuilder.buildOperatingSystem();
		Phone phone = phoneBuilder.getPhone();
		return phone;
	}
}
