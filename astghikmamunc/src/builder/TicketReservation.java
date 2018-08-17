package builder;

import java.util.Date;

/**
 * Created by astghik.mamunc on 8/17/2018.
 */
public class TicketReservation {

	private int persons;

	private Date start;

	private Date end;

	private boolean withLugagge;

	public TicketReservation(int persons, Date start, Date end, boolean withLugagge) {
		this.persons = persons;
		this.start = start;
		this.end = end;
		this.withLugagge = withLugagge;
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

	public boolean isWithLugagge() {
		return withLugagge;
	}

	public void setWithLugagge(boolean withLugagge) {
		this.withLugagge = withLugagge;
	}
}
