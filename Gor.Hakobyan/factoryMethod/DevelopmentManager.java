package factoryMethod;

/**
 * @author Gor.Hakobyan on 15-Aug-18.
 */
public class DevelopmentManager extends HiringManager {
	public Interviewer makeInterviewer(){
		return new Developer();
	}
}