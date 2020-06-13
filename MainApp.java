import java.util.Scanner;

import entity.Booking;
import service.BookingService;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookingService bookingService = new BookingService();
		Booking booking = new Booking();
		while(true) {
			String command = scanner.nextLine();
			switch(command) {
				case "store":
				bookingService.store(booking);
				break;
				case "validate":
				bookingService.validate(booking);
				break;
				case "delete":
				bookingService.delete(booking);
				break;
				case "update":
				bookingService.update(booking);
				break;
				case "print":
				bookingService.print(booking);
				break;
				case "cancel":
				bookingService.cancel(booking);
				break;
				case "assign":
				bookingService.assignFolder(booking);
				break;
				case "unassign":
				bookingService.unassignFolder(booking);
				break;
				case "association":
				bookingService.bookingAssociation(booking);
				break;
				case "dissociation":
				bookingService.bookingDissociation(booking);
				break;
				default:
				System.out.println("Operation not supported");
				break;
			}
			System.out.println(bookingService.getCurrentState());
			System.out.println();
		}
	}

}