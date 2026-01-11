
public class Ticket extends BookingEngine {

	private int bookingNumber;
	private static int bookingNumberGenerator = 0;
	private double fare;

	public double getFare() {
		return fare;
	}

	protected void setFare(Double double1) {
		this.fare = double1;
	}

	public int getBookingNumber() {
		return bookingNumber;
	}

	// Thread-safe method to get next booking number
	private static synchronized int getNextBookingNumber() {
		return ++bookingNumberGenerator;
	}

	Ticket() {
		bookingNumber = getNextBookingNumber();
	}

}
