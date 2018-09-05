package adapter.api;

import java.util.Map;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public interface IndicatorTrackingIF {

	Map<String, Object> getUpdatedData();

	Map<String, Object> getInsertedData();

	Map<String, Object> getDeletedData();
}
