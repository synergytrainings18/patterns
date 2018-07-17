package patterns.flyweight;

/**
 * @author Lernik Mirzoyan. Created on 17.07.2018.
 */
public class Platform {
	private PlatformType type;
	Platform (PlatformType type){
		this.type = type;
	}

	public PlatformType getType() {
		return type;
	}

	public void setType(PlatformType type) {
		this.type = type;
	}
}
