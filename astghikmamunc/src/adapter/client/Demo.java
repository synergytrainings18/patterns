package adapter.client;

import adapter.api.IndicatorService;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public class Demo {

	public static void main(String[] args) {

		TrackingData trackingData = new TrackingData();

		IndicatorTrackingAdapter indicatorTrackingAdapter = new IndicatorTrackingAdapter(trackingData);

		IndicatorService indicatorService = new IndicatorService();

		indicatorService.calculate(indicatorTrackingAdapter);
	}

}
