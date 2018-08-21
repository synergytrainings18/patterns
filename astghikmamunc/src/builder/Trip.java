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

	private Trip(List<HotelReservation> hotelReservations, List<TicketReservation> ticketReservations) {
		this.hotelReservations = hotelReservations;
		this.ticketReservations = ticketReservations;
	}

	public List<HotelReservation> getHotelReservations() {
		return Collections.unmodifiableList(hotelReservations);
	}

	public List<TicketReservation> getTicketReservations() {
		return Collections.unmodifiableList(ticketReservations);
	}

	public static TripBuilder getTripBuilder() {
		return new TripBuilder();
	}

	public static class TripBuilder {
		List<TicketReservation> ticketReservations;
		List<HotelReservation> hotelReservations;

		public TripBuilder(){
			hotelReservations = new ArrayList<>();
			ticketReservations = new ArrayList<>();
		}

		public TripBuilder addHotelReservation(String hotelName, int persons, Date start, Date end){
			HotelReservation hotelReservation = new HotelReservation(hotelName, persons, start, end);
			hotelReservations.add(hotelReservation);
			return this;
		}

		public TripBuilder addTicketReservation(int persons, Date start, Date end, boolean withLuggage){
			TicketReservation ticketReservation = new TicketReservation(persons, start, end, withLuggage);
			ticketReservations.add(ticketReservation);
			return this;
		}

		public Trip build(){
			if(ticketReservations.isEmpty()){
				throw new IllegalStateException("Be sure that your trip have at least one ticket reservation");
			}
			return new Trip(hotelReservations, ticketReservations);
		}
	}
}
