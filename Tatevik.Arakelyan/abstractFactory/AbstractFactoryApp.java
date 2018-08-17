
import impl.LeftWandFactory;
import util.TwixUtil;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class AbstractFactoryApp {
	public static void main(String[] args) {
		TwixUtil.createTwix(new LeftWandFactory());
	}
}
