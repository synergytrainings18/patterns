package abstract_factory.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class PersonalInformationManager {

	public AddressFactory addressFactory;

	public PersonalInformationManager(AddressFactory addressFactory) {
		this.addressFactory = addressFactory;
	}

	public Map<String, Object> generateFullInfo(){
		Address address = addressFactory.createAddress();
		PhoneNumber phoneNumber = addressFactory.createPhoneNumber();
		Map<String, Object> info = new HashMap<>();
		info.put("address", address);
		info.put("phone", phoneNumber);
		return info;
	}
}
