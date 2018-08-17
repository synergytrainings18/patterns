package impl;

import interfaces.Caramel;
import interfaces.Chocolate;
import interfaces.TwixFactory;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class LeftWandFactory implements TwixFactory {
	@Override
	public Caramel getCararmel() {
		return new LeftCaramel();
	}

	@Override
	public Chocolate getChocolate() {
		return new LeftChocolate();
	}
}
