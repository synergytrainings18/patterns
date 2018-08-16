package abstract_factory.api;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public abstract class PhoneNumber {

	private String phoneNumber;

	public abstract String getCountryCode();

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		try {
			Long.parseLong(phoneNumber);
			this.phoneNumber = phoneNumber;
		} catch (NumberFormatException e) {
		}
	}
}
