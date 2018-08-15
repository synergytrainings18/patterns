package factoryMethod;

/**
 * @author Gor.Hakobyan on 15-Aug-18.
 */
public class Demo {

	public static void main(String[] args) {
		HiringManager devManager = new DevelopmentManager();
		devManager.takeInterview();

		HiringManager marketingManager = new MarketingManager();
		marketingManager.takeInterview();
	}
}