package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

/**
 * @author Lernik Mirzoyan. Created on 17.07.2018.
 */
public class Factory {
	private static final Map<PlatformType, Platform> platforms = new HashMap<>();
	private static final Map<Integer, Star> stars = new HashMap<>();

	public Platform getPlatform(PlatformType type){
		Platform platform = platforms.get(type);
		if (isNull(platform)) {
			platform = new Platform(type);
			platforms.put(type, platform);
		}
		return platform;
	}

	public Star getStar(Integer point){
		Star star = stars.get(point);
		if (isNull(star)) {
			star = new Star(point);
			stars.put(point, star);
		}
		return star;
	}
}
