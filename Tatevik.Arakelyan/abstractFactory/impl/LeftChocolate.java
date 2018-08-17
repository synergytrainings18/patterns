package impl;

import interfaces.Chocolate;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class LeftChocolate implements Chocolate {
	@Override
	public void kindOfTwix() {
		System.out.println("Left Chocolate.");

	}

	@Override
	public void kindOfPutOnChocolate() {
		System.out.println("Dip a wand into chocolate.");
	}
}
