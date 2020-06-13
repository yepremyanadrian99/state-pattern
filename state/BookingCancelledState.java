package state;

public class BookingCancelledState implements BookingState {

	public String getCurrentState() {
		return "CancelledState";
	}

}