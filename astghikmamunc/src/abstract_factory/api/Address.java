package abstract_factory.api;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public abstract class Address {

	private String region;

	private String street;

	private String city;

	private String postalCode;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public abstract String getCountry();

	public String getFullAddress(){
		return street + "/" + city + " " + postalCode + getCountry();
	}
}
