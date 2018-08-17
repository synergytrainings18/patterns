package builder;

import java.util.Date;

/**
 * Created by astghik.mamunc on 8/17/2018.
 */
public class MakeTrip {

	private Trip.TripBuilder tripBuilder;

	public void addTrip(){
		this.tripBuilder = Trip.getTripBuilder();
	}

	public void reserveHotel(String hotelName, int persons, Date start, Date end){
		if(this.tripBuilder != null) {
			this.tripBuilder.addHotelReservation(hotelName, persons, start, end);
		}
	}

	public void reserveTicket(int persons, Date start, Date end, boolean withLuggage){
		if(this.tripBuilder != null) {
			this.tripBuilder.addTicketReservation(persons, start, end, withLuggage);
		}
	}

	public Trip generateTrip(){
		return this.tripBuilder.build();
	}

}
