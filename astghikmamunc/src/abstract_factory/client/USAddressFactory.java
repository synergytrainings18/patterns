package abstract_factory.client;

import abstract_factory.api.AddressFactory;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class USAddressFactory implements AddressFactory<USAddress, USPhoneNumber> {
	@Override
	public USAddress createAddress() {
		return new USAddress();
	}

	@Override
	public USPhoneNumber createPhoneNumber() {
		return new USPhoneNumber();
	}
}
