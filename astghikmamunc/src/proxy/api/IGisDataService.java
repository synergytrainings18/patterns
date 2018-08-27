package proxy.api;

import java.util.Map;

/**
 * Created by astghik.mamunc on 8/27/2018.
 */
public interface IGisDataService {

	void createNewShape(String url, Map<String, Object> subEntity, Object... uriVariables);

	void updateShape(String url,  Map<String, Object> subEntity , Object... uriVariables );

	void deleteShape(String url,Object... uriVariables );
}
