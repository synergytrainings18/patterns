package builder;

import java.util.Date;

/**
 * Created by astghik.mamunc on 8/17/2018.
 */
public class HotelReservation {

	private String hotelName;

	private int persons;

	private Date start;

	private Date end;

	public HotelReservation() {
	}

	public HotelReservation(String hotelName, int persons, Date start, Date end) {
		this.hotelName = hotelName;
		this.persons = persons;
		this.start = start;
		this.end = end;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int persons) {
		this.persons = persons;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
}
