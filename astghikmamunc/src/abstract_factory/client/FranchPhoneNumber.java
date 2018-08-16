package abstract_factory.client;

import abstract_factory.api.PhoneNumber;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class FranchPhoneNumber extends PhoneNumber {
	@Override
	public String getCountryCode() {
		return "33";
	}
}
