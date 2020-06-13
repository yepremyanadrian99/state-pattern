package state;

import entity.Booking;

public class BookingNullState implements BookingState {

	public BookingState store(Booking booking) {
		// store
		return new BookingStoredState();
	}

	public BookingState validate(Booking booking) {
		// validate
		return new BookingValidatedState();
	}

	public BookingState assignFolder(Booking booking) {
		// assign folder
		return new BookingCompletedState();
	}

	public String getCurrentState() {
		return "NullState";
	}

}