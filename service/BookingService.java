package service;

import entity.Booking;
import state.BookingState;

import state.BookingNullState;

public class BookingService {

	private BookingState bookingState;

	public BookingService() {
		this.bookingState = new BookingNullState();
	}

	public void store(Booking booking) {
		this.bookingState = this.bookingState.store(booking);
	}

	public void validate(Booking booking) {
		this.bookingState = this.bookingState.validate(booking);
	}

	public void delete(Booking booking) {
		this.bookingState = this.bookingState.delete(booking);
	}

	public void update(Booking booking) {
		this.bookingState = this.bookingState.update(booking);
	}

	public void print(Booking booking) {
		this.bookingState = this.bookingState.print(booking);
	}

	public void cancel(Booking booking) {
		this.bookingState = this.bookingState.cancel(booking);
	}

	public void assignFolder(Booking booking) {
		this.bookingState = this.bookingState.assignFolder(booking);
	}

	public void unassignFolder(Booking booking) {
		this.bookingState = this.bookingState.unassignFolder(booking);
	}

	public void bookingAssociation(Booking booking) {
		this.bookingState = this.bookingState.bookingAssociation(booking);
	}

	public void bookingDissociation(Booking booking) {
		this.bookingState = this.bookingState.bookingDissociation(booking);
	}

	public String getCurrentState() {
		return this.bookingState.getCurrentState();
	}

}