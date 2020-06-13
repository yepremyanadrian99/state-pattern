package state;

import entity.Booking;

public class BookingStoredState implements BookingState {

	public BookingState validate(Booking booking) {
		// validate
		return new BookingValidatedState();
	}

	public BookingState delete(Booking booking) {
		// delete
		return new BookingNullState();
	}

	public BookingState update(Booking booking) {
		// update
		return this;
	}

	public String getCurrentState() {
		return "StoredState";
	}

}