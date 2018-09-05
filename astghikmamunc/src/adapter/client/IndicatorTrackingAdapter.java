package adapter.client;

import adapter.api.IndicatorTrackingIF;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public class IndicatorTrackingAdapter implements IndicatorTrackingIF {

	private TrackingData trackingData;

	public IndicatorTrackingAdapter(TrackingData trackingData) {
		this.trackingData = trackingData;
	}

	@Override
	public Map<String, Object> getUpdatedData() {
		return convert(trackingData.getUpdatedData());
	}

	@Override
	public Map<String, Object> getInsertedData() {
		return convert(trackingData.getInsertedData());
	}

	@Override
	public Map<String, Object> getDeletedData() {
		return convert(trackingData.getDeletedData());
	}

	private Map<String, Object> convert(String data){
		return new HashMap<>();
	}
}
