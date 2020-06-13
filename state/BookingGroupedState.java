package state;

import entity.Booking;

public class BookingGroupedState implements BookingState {

	public BookingState update(Booking booking) {
		// update
		return this;
	}

	public BookingState print(Booking booking) {
		// print
		return this;
	}

	public BookingState bookingDissociation(Booking booking) {
		// booking dissociation
		return new BookingCompletedState();
	}

	public String getCurrentState() {
		return "GroupedState";
	}

}