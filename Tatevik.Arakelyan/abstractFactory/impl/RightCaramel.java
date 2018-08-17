package impl;

import interfaces.Caramel;

/**
 * @author by Tatevik.Arakelyan on 8/16/2018.
 */
public class RightCaramel implements Caramel {
	@Override
	public void kindOfTwix() {
		System.out.println("Right Caramel.");
	}

	@Override
	public void kindOfPutOnCaramel() {
		System.out.println("Put a caramel vertically in a wand.");
	}
}
