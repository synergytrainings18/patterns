package adapter.client;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public interface IndicatorServiceAdapterIF {


	CalculatedData calculate(IndicatorTracking trackingData);

	boolean update(IndicatorTracking trackingData);

	boolean insert(IndicatorTracking trackingData);

}
