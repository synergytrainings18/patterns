package abstract_factory.client;

import abstract_factory.api.Address;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class FrenchAddress extends Address {
	@Override
	public String getCountry() {
		return "France";
	}
}
