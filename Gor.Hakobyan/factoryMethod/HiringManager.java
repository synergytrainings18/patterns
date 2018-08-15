package factoryMethod;

/**
 * @author Gor.Hakobyan on 15-Aug-18.
 */
abstract class HiringManager {
	abstract public Interviewer makeInterviewer();

	void takeInterview() {
		Interviewer interviewer = makeInterviewer();
		interviewer.askQuestions();
	}
}