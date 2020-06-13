package state;

import entity.Booking;

public class BookingCompletedState implements BookingState {

	public BookingState update(Booking booking) {
		// update
		return this;
	}

	public BookingState print(Booking booking) {
		// print
		return this;
	}

	public BookingState unassignFolder(Booking booking) {
		// unassign folder
		return new BookingValidatedState();
	}

	public BookingState bookingAssociation(Booking booking) {
		// booking association
		return new BookingGroupedState();
	}

	public BookingState bookingDissociation(Booking booking) {
		// booking dissociation
		return new BookingCancelledState();
	}

	public String getCurrentState() {
		return "CompletedState";
	}

}