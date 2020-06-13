package state;

import entity.Booking;

public interface BookingState {

	default BookingState store(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState validate(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState delete(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState update(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState print(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState cancel(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState assignFolder(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState unassignFolder(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState bookingAssociation(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	default BookingState bookingDissociation(Booking booking) {
		System.out.println("Operation not permitted in this state");
		return this;
	}

	String getCurrentState();

}