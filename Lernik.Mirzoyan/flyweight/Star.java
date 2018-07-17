package patterns.flyweight;

/**
 * @author Lernik Mirzoyan. Created on 17.07.2018.
 */
public class Star {
	private Integer point;
	Star (Integer point){
		this.point = point;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}
}
