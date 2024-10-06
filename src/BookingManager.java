import java.util.ArrayList;
import java.util.List;

public class BookingManager{

    private List<Booking> bookings = new ArrayList<>();

    public void addbooking(Booking booking){
        bookings.add(booking);
    }

    public void displayBookingManager() {
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }
    }
}