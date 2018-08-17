package impl;

import interfaces.Chocolate;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class RightChocolate implements Chocolate {
	@Override
	public void kindOfTwix() {
		System.out.println("Right chocolate");
	}

	@Override
	public void kindOfPutOnChocolate() {
		System.out.println("Put a chocolate a kind of top to down  in a wand․");
	}
}
