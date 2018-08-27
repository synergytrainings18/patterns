package proxy.api;

import java.util.Map;

/**
 * Created by astghik.mamunc on 8/27/2018.
 */
public class GisDataService implements IGisDataService {

	public void createNewShape(String url, Map<String, Object> subEntity , Object... uriVariables ){
		System.out.println("new shape created");
	}

	public void updateShape(String url,  Map<String, Object> subEntity , Object... uriVariables ){
		System.out.println("shape updated");
	}

	public void deleteShape(String url,Object... uriVariables ){
		System.out.println("shape deleted");
	}
}
