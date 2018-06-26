package singleton;

/**
 * @author by Tatevik.Arakelyan on 6/25/2018.
 */
public class WinnerContender extends Contender {
	private static WinnerContender instance = new WinnerContender();


	private WinnerContender() {
		super();
	}

	private WinnerContender(String name, int numberOfVoter) {
		super(name, numberOfVoter);
	}

	public static void checkVoter(Contender newContender) {
		if (newContender != null && newContender.getNumberOfVoter() != null) {
			if (instance.getNumberOfVoter() != null) {
				if (newContender.getNumberOfVoter() > instance.getNumberOfVoter()) {
					instance = new WinnerContender(newContender.getName(), newContender.getNumberOfVoter());
				}else{
					return;
				}
			}
			instance = new WinnerContender(newContender.getName(), newContender.getNumberOfVoter());
		}
	}


	public static WinnerContender getInstance() {
		return instance;

	}


	public static void main(String[] args) {

		Contender[] arrayOfContender = {new Contender("aaa", 45), new Contender("sss", 70), new Contender("b", 65)};


		for (int i = 0; i < arrayOfContender.length; ++i) {
			WinnerContender.checkVoter(arrayOfContender[i]);
		}
		System.out.print(WinnerContender.getInstance().getNumberOfVoter());


	}


}



