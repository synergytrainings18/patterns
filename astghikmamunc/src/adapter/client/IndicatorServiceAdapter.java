package adapter.client;

import adapter.api.IndicatorServiceIF;

/**
 * Created by astghik.mamunc on 9/5/2018.
 */
public class IndicatorServiceAdapter  implements IndicatorServiceAdapterIF{

	private IndicatorServiceIF indicatorService;

	public IndicatorServiceAdapter(IndicatorServiceIF indicatorService) {
		this.indicatorService = indicatorService;
	}

	@Override
	public CalculatedData calculate(IndicatorTracking trackingData) {
		String data = convertToJsonStr(trackingData);
		String calculcatedData = indicatorService.calculate(data);
		return convertToCalculatedData(calculcatedData);
	}

	@Override
	public boolean update(IndicatorTracking trackingData) {
		return indicatorService.update(convertToJsonStr(trackingData));
	}

	@Override
	public boolean insert(IndicatorTracking trackingData) {
		return indicatorService.insert(convertToJsonStr(trackingData));
	}

	private String convertToJsonStr(IndicatorTracking indicatorTracking){
		// convert to json TODO
		return "";
	}

	private CalculatedData convertToCalculatedData(String data){
		// convert to Calculated data
		return new CalculatedData();
	}

}
