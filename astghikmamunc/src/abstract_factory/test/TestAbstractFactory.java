package abstract_factory.test;

import abstract_factory.api.PersonalInformationManager;
import abstract_factory.client.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public class TestAbstractFactory {
	@Test
	public void testUSAddressAbstractFactory(){
		PersonalInformationManager personalInformationManager = new PersonalInformationManager(new USAddressFactory());
		Map<String, Object> fullInfo = personalInformationManager.generateFullInfo();
		Assert.assertEquals("The address must be USAddress", USAddress.class,  fullInfo.get("address").getClass());
		Assert.assertEquals("The phoneNumber must be USAddress", USPhoneNumber.class,  fullInfo.get("phone").getClass());
	}

	@Test
	public void testFrenchAddressAbstractFactory(){
		PersonalInformationManager personalInformationManager = new PersonalInformationManager(new FrenchAddressFactory());
		Map<String, Object> fullInfo = personalInformationManager.generateFullInfo();
		Assert.assertEquals("The address must be FrenchAddress", FrenchAddress.class,  fullInfo.get("address").getClass());
		Assert.assertEquals("The phoneNumber must be FranchPhoneNumber", FranchPhoneNumber.class,  fullInfo.get("phone").getClass());
	}
}
