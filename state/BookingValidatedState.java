package state;

import entity.Booking;

public class BookingValidatedState implements BookingState {

	public BookingState update(Booking booking) {
		// update
		return this;
	}

	public BookingState print(Booking booking) {
		// print
		return this;
	}

	public BookingState cancel(Booking booking) {
		// cancel
		return new BookingCancelledState();
	}

	public BookingState assignFolder(Booking booking) {
		// assign folder
		return new BookingCompletedState();
	}

	public String getCurrentState() {
		return "ValidatedState";
	}

}