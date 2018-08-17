package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by astghik.mamunc on 8/17/2018.
 */
public class Trip {

	private final List<HotelReservation> hotelReservations;

	private final List<TicketReservation> ticketReservations;

	public Trip() {
		this.hotelReservations = new ArrayList<>();
		this.ticketReservations = new ArrayList<>();
	}

	public List<HotelReservation> getHotelReservations() {
		return Collections.unmodifiableList(hotelReservations);
	}

	public List<TicketReservation> getTicketReservations() {
		return Collections.unmodifiableList(ticketReservations);
	}

	private void addHotelReservation(HotelReservation hotelReservation) {
		this.hotelReservations.add(hotelReservation);
	}

	private void addTicketReservation(TicketReservation ticketReservation) {
		this.ticketReservations.add(ticketReservation);
	}

	public static TripBuilder getTripBuilder() {
		return new Trip().new TripBuilder();
	};

	public class TripBuilder {

		public TripBuilder(){
		}

		public TripBuilder addHotelReservation(String hotelName, int persons, Date start, Date end){
			HotelReservation hotelReservation = new HotelReservation(hotelName, persons, start, end);
			Trip.this.addHotelReservation(hotelReservation);
			return this;
		}

		public TripBuilder addTicketReservation(int persons, Date start, Date end, boolean withLuggage){
			TicketReservation ticketReservation = new TicketReservation(persons, start, end, withLuggage);
			Trip.this.addTicketReservation(ticketReservation);
			return this;
		}

		public Trip build(){
			if(Trip.this.getTicketReservations().isEmpty()){
				throw new IllegalStateException("Be sure that your trip have at least one ticket reservation");
			}
			return Trip.this;
		}
	}
}
