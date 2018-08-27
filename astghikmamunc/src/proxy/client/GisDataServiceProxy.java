package proxy.client;

import proxy.api.GisDataService;
import proxy.api.IGisDataService;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by astghik.mamunc on 8/27/2018.
 */
public class GisDataServiceProxy implements IGisDataService {

	private GisDataService gisDataService;

	@Override
	public void createNewShape(String url, Map<String, Object> subEntity, Object... uriVariables) {
		if(gisDataService == null){
			gisDataService = new GisDataService();
		}
		gisDataService.createNewShape(url, subEntity, uriVariables);
		Logger.getLogger("Shape is created with " + subEntity.get("longitude") + " longitude and " + subEntity.get("latitude") + " latitude");
	}

	@Override
	public void updateShape(String url, Map<String, Object> subEntity, Object... uriVariables) {
		if(gisDataService == null){
			gisDataService = new GisDataService();
		}
		gisDataService.updateShape(url, subEntity, uriVariables);
		Logger.getLogger("Shape is updated with " + subEntity.get("longitude") + " longitude and " + subEntity.get("latitude") + " latitude");
	}

	@Override
	public void deleteShape(String url, Object... uriVariables) {
		if(gisDataService == null){
			gisDataService = new GisDataService();
		}
		gisDataService.deleteShape(url, uriVariables);
		Logger.getLogger("Shape is deleted with " + uriVariables + " id");
	}
}
