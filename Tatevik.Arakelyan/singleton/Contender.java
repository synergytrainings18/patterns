package singleton;

/**
 * @author by Tatevik.Arakelyan on 6/25/2018.
 */
public class Contender {
	private String name;
	private Integer numberOfVoter;

	public Contender() {
	}


	public String getName() {
		return name;
	}

	public Contender(String name, Integer numberOffVoter) {
		this.name = name;
		this.numberOfVoter = numberOffVoter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfVoter() {
		return numberOfVoter;
	}

	public void setNumberOfVoter(Integer numberOfVoter) {
		this.numberOfVoter = numberOfVoter;
	}
}
