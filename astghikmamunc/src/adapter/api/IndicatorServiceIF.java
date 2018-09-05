package adapter.api;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public interface IndicatorServiceIF {

	String calculate(String data);

	boolean update(String data);

	boolean insert(String data);

}
