package abstract_factory.api;

/**
 * Created by astghik.mamunc on 8/16/2018.
 */
public interface AddressFactory<A extends Address, P extends PhoneNumber> {

	public A createAddress();

	public P createPhoneNumber();

}
