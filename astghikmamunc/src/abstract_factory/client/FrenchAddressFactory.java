package abstract_factory.client;

import abstract_factory.api.Address;
import abstract_factory.api.AddressFactory;
import abstract_factory.api.PhoneNumber;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class FrenchAddressFactory implements AddressFactory<FrenchAddress, FranchPhoneNumber> {
	@Override
	public FrenchAddress createAddress() {
		return new FrenchAddress();
	}

	@Override
	public FranchPhoneNumber createPhoneNumber() {
		return new FranchPhoneNumber();
	}
}
