import javax.xml.namespace.QName;
import java.util.List;

public class Booking {
    private String date;
    private boolean vacation;
    private Room room;
    private Guest guest;
    private Guest otherGuest;
    private boolean isOtherguest;

    public Booking (String date, boolean vacation, Room room,Guest guest) {
        this.date = date;
        this.vacation = vacation;
        this.room = room;
        this.guest = guest;
    }

    public void setOtherGuest(Guest otherGuest) {
        this.otherGuest = otherGuest;
    }

    public boolean isOtherguest() {
        return isOtherguest;
    }

    public void setOtherguest(boolean otherguest) {
        isOtherguest = otherguest;
    }

    @Override
    public String toString() {
        return "Rezervace " + date + " je na pokoj " + room.getRoomNumber() +
                "pro hosta jménem: " + guest.getName() + guest.getLastName() +
                otherGuest.getName() + otherGuest.getLastName();
    }
}
