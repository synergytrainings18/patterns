package factoryMethod;

/**
 * @author Gor.Hakobyan on 15-Aug-18.
 */
public class MarketingManager extends HiringManager {
	public Interviewer makeInterviewer(){
		return new CommunityExecutive();
	}
}